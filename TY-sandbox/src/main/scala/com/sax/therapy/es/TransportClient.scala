package com.sax.therapy.es


import java.net.InetAddress
import java.util.Properties

import akka.actor.{Props, Actor}
import com.sax.therapy.stream.Marshaller
import org.elasticsearch.action.search.{SearchResponse, SearchRequestBuilder}
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.elasticsearch.index.query.{QueryBuilders, BoolQueryBuilder}
import org.elasticsearch.search.SearchHit
import org.elasticsearch.search.sort.SortOrder
import org.slf4j.{LoggerFactory, Logger}
import org.elasticsearch.common.xcontent.XContentFactory._

import com.sax.therapy.models.raw.{Remove, Tweet => RawTweet, User => RawUser}
import com.sax.therapy.models.enriched.{Tweet => EnrichedTweet, User => EnrichedUser}

/**
  * Created by therapy2 on 1/30/16.
  * Main transport client for ES connection.
  */
class TransportClient extends Actor {
  private val logger: Logger = LoggerFactory.getLogger(classOf[TransportClient])
  private val settings = Settings.settingsBuilder().put(clusterName, clusterVal).build()
  private val esClient = TransportClient.builder().settings(settings).build()


  override def preStart() {
    val inetSocketTransportAddress = new InetSocketTransportAddress(InetAddress.getByName(hostVal), portVal.toInt)
    esClient.addTransportAddress(inetSocketTransportAddress)
  }

  /**
    * Returns JSON representing each of the requested tweets, as retrieved from Elastic.
    *
    * @return JSON representing each of the requested tweets, as retrieved from Elastic
    */
  def receive = {
    //TODO: implement bulk operations
    case search: Search => {
      sender ! new Response(lookupByMultipleFields(search))
    }
    case InsertTweet(tw: RawTweet) => {
      val tweet: String = Marshaller.toEnrichedTweetJson(tw)
      esClient.prepareIndex(indexVal, tweetTypeVal, tw.id_str).
        setSource(tweet).
        get()
    }
    case InsertUser(u) => {
      val user: String = Marshaller.toEnrichedUserJson(u)
      esClient.prepareIndex(indexVal, userTypeVal, u.id_str).
        setSource(user).
        get()
    }
    case DeleteTweet(tweet) => {
      esClient.prepareDelete(indexVal, tweetTypeVal, tweet.delete.status.id_str)
        .execute()
        .actionGet()
    }
    case done: Done => {
      esClient.close()
      context.stop(self)
    }
  }

  def lookupByMultipleFields(search: Search): Array[String] = {
    val srb: SearchRequestBuilder = esClient.prepareSearch(indexVal).setTypes(tweetTypeVal)
    val qb: BoolQueryBuilder = search.filter.map(
      f => {
        QueryBuilders.termsQuery(f._1, f._2)
      }
    ).foldLeft(QueryBuilders.boolQuery)((a,b) => a.should(b))
    val searchResponse: SearchResponse = srb.setQuery(qb).setSize(search.size).setFrom(search.from).addSort(DateField, SortOrder.DESC).execute.actionGet
    val hits: Array[SearchHit] = searchResponse.getHits.getHits
    val hitCount: Int = searchResponse.getHits.getTotalHits.intValue
    println("For the current search, hits.size is: " + hits.length + " and hitCount is: " + hitCount)
    hits.map(h => h.getSourceAsString)
  }
}
