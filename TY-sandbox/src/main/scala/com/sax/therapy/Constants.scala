package com.sax.therapy

/**
  * Created by therapy2 on 1/24/16.
  * Project constants.
  */
object Constants {
  //Twitter configuration params
  val confName = "application"
  val consumerKeyField = "twitter.consumer.key"
  val consumerSecretField = "twitter.consumer.secret"
  val accessTokenField = "twitter.access.key"
  val accessTokenSecretField = "twitter.access.secret"

  //ElasticSearch configuration params
  //FIXME: based on the runtime environment, configuration has to change
  val esConfName = "es/es-remote.conf"
  val clusterField = "es.tweet.cluster"
  val hostField = "es.tweet.host"
  val portField = "es.tweet.port"
  val indexField = "es.tweet.index"

  val rssConfName = "rss/feeds.conf"
  val newsHostField = "reuters.feed.newsHost"
  val newsPagesField = "reuters.feed.newsPages"
  val reutersHostField = "reuters.feed.reutersHost"
  val reutersPagesField = "reuters.feed.reutersPages"
  val videoHostField = "reuters.feed.videoHost"
  val videoPagesField = "reuters.feed.videoPages"
  val blogHostField = "reuters.feed.blogHost"
  val blogPagesField = "reuters.feed.blogPages"
  val specialPagesField = "reuters.feed.specialPages"
}
