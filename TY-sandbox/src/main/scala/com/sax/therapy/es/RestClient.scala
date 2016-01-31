package com.sax.therapy.es


import java.net.InetAddress
import java.util.Properties

import collection.JavaConversions._

import akka.actor.{Props, Actor}
import com.sax.therapy.stream.Marshaller
import io.searchbox.client.JestClientFactory
import io.searchbox.client.config.HttpClientConfig
import io.searchbox.core.search.sort.Sort
import io.searchbox.core.{Search => SR, SearchResult, Delete, Index}
import org.elasticsearch.action.search.{SearchResponse, SearchRequestBuilder}
import org.elasticsearch.index.query.{QueryBuilders, BoolQueryBuilder}
import org.elasticsearch.search.builder.SearchSourceBuilder
import org.slf4j.{LoggerFactory, Logger}
import com.sax.therapy.models.raw.{Remove, Tweet => RawTweet, User => RawUser}
import com.sax.therapy.models.enriched.{Tweet => EnrichedTweet, User => EnrichedUser}

/**
  * Created by therapy2 on 1/30/16.
  * Main REST client for ES connection.
  */
class RestClient extends Actor {
  private val logger: Logger = LoggerFactory.getLogger(classOf[RestClient])
  private val clientConfig = new HttpClientConfig.Builder("http://" + hostVal + ":" + portVal).multiThreaded(true).build()
  val factory = new JestClientFactory()
  factory.setHttpClientConfig(clientConfig)
  val esClient = factory.getObject()


  override def preStart() {
  }

  /**
    * Returns JSON representing each of the requested tweets, as retrieved from Elastic.
    *
    * @return JSON representing each of the requested tweets, as retrieved from Elastic
    */
  def receive = {
    //TODO: implement bulk operations
    case search: Search => {
      sender ! new Response(lookupByMultipleFields(search).toArray)
    }
    case InsertTweet(tw: RawTweet) => {
      val tweet: String = Marshaller.toEnrichedTweetJson(tw)
      val index = new Index.Builder(tweet).index(indexVal).`type`(tweetTypeVal).id(tw.id_str).build()
      esClient.execute(index)
    }
    case InsertUser(u) => {
      val user: String = Marshaller.toEnrichedUserJson(u)
      val index = new Index.Builder(user).index(indexVal).`type`(userTypeVal).id(u.id_str).build()
      esClient.execute(index)
    }
    case DeleteTweet(tweet) => {
      val index = new Delete.Builder(tweet.delete.status.id_str).index(indexVal).`type`(tweetTypeVal).build()
      esClient.execute(index)
    }
    case done: Done => {
      esClient.shutdownClient()
      context.stop(self)
    }
  }

  def lookupByMultipleFields(search: Search): List[String] = {
    val searchSourceBuilder = new SearchSourceBuilder()
    val qb: BoolQueryBuilder = search.filter.map(
      f => {
        QueryBuilders.termsQuery(f._1, f._2)
      }
    ).foldLeft(QueryBuilders.boolQuery)((a,b) => a.should(b))
    val srb = new SR.Builder(qb.toString).addIndex(indexVal).addType(tweetTypeVal).addSort(new Sort(DateField)).build()
    val hits: SearchResult = esClient.execute(srb)
    val hitCount: Int = hits.getTotal
    println("For the current search, the hitCount is: " + hitCount)
    hits.getSourceAsObjectList(classOf[String]).toList
  }
}
