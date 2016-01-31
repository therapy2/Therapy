package com.sax.therapy.es

import com.sax.therapy.models.raw.{Remove, Tweet => RawTweet, User => RawUser}
import com.sax.therapy.models.enriched.{Tweet => EnrichedTweet, User => EnrichedUser}

/**
  * Created by therapy2 on 1/30/16.
  */

trait MessageType {

}

//Search for hits based on the values of multiple fields
case class Search(filter: Map[String, String], size: Int = MAXSIZE, from: Int = 0)
//Search response
case class Response(content: Array[String])
case class InsertTweet(tweet: RawTweet)
case class InsertUser(user: RawUser)
case class DeleteTweet(remove: Remove)
case class Done() extends MessageType

