package com.sax.therapy.stream

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
  def toEnrichedTweetJson(tweet: Tweet): String = {
    write(tweet.enrich)
  }
  def toEnrichedUserJson(user: User): String = {
    write(user.enrich)
  }
}
