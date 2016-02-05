package com.sax.therapy.twitter.util

import com.sax.therapy.models.APIType
import com.sax.therapy.models.raw._
import org.json4s.DefaultFormats
import org.json4s.native.Serialization.{read, write}

/**
  * Created by therapy2 on 1/29/16.
  * Main marshalling/unmarshalling object for the Streaming API.
  */
object Marshaller {
  implicit val formats = DefaultFormats
  def toTweet(s: String): Tweet = {
    read[Tweet](s)
  }
  def toRemove(s: String): Remove = {
    read[Remove](s)
  }
  def toEnrichedTweetJson(tweet: Tweet, fromStream: APIType): String = {
    write(tweet.enrich(fromStream))
  }
  def toEnrichedUserJson(user: User): String = {
    write(user.enrich)
  }
}
