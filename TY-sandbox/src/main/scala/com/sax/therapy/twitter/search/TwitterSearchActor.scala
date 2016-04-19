package com.sax.therapy.twitter.search

import akka.actor.Actor
import com.sax.therapy.conn._
import twitter4j.{User, ResponseList, Twitter, TwitterFactory}
/**
  * Created by therapy2 on 4/19/16.
  * Searches Twitter api for particular users
  */

object TwitterSearchActor {
  case class SearchUsers(user: String)

  def find(user: String): List[String]  = {
    lazy val twitter: Twitter = new TwitterFactory(twitterConfig).getInstance()
    val rl: ResponseList[User] = twitter.searchUsers(user, 1)
    val names: List[String] =
      (for( i <- 0 until rl.size())yield{
        val user: User = rl.get(i)
        user.getScreenName
      }).toList
    names
  }
}
class TwitterSearchActor  extends Actor  {
  lazy val twitter: Twitter = new TwitterFactory(twitterConfig).getInstance()
  def receive = {
    case TwitterSearchActor.SearchUsers(user) => {
     twitter.searchUsers(user, 1)
    }
  }
}
