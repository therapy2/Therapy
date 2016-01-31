package com.sax.therapy.stream

import Marshaller._
import com.sax.therapy.es._
import com.sax.therapy.models.raw.{Tweet, Remove, RawObject}
import twitter4j._
import com.sax.therapy.models.enriched.{Place => EnrichedPlace}
import akka.actor.{Props, ActorSystem}


/**
  * Created by therapy2 on 1/24/16.
  * Listeners for the Twitter stream API.
  */
object TwitterListeners {
  val logger = Logger.getLogger(TwitterListeners.getClass)
  val system = ActorSystem("ESActorSystem")
  val esActor = system.actorOf(Props[RestClient], "ESClientActor")
  def rawMessageListener = new RawStreamListener {
    override def onMessage(s: String): Unit = {
      if(s.substring(0, 8) == "{\"delete") {
        val remove = toRemove(s)
        logger.debug("Now deleting tweet_id: " + remove.delete.status.id)
        esActor ! DeleteTweet(remove)
      }
      else {
        val tweet = toTweet(s)
        logger.debug("Now inserting tweet_id: " + tweet.id)
        esActor ! InsertTweet(tweet)
        logger.debug("Now inserting user_id: " + tweet.user.id)
        esActor ! InsertUser(tweet.user)
      }
    }
    override def onException(ex: Exception): Unit = { logger.error("Unable to listen to messages " + ex ) }
  }

  def siteStreamListener = new SiteStreamsListener {
    override def onFriendList(l: Long, longs: Array[Long]): Unit = {}
    override def onUserListUnsubscription(l: Long, user: User, user1: User, userList: UserList): Unit = {}
    override def onBlock(l: Long, user: User, user1: User): Unit = {}
    override def onUserListSubscription(l: Long, user: User, user1: User, userList: UserList): Unit = {}
    override def onFollow(l: Long, user: User, user1: User): Unit = {}
    override def onUserListMemberAddition(l: Long, user: User, user1: User, userList: UserList): Unit = {}
    override def onDirectMessage(l: Long, directMessage: DirectMessage): Unit = {}
    override def onUnblock(l: Long, user: User, user1: User): Unit = {}
    override def onUserListUpdate(l: Long, user: User, userList: UserList): Unit = {}
    override def onUnfollow(l: Long, user: User, user1: User): Unit = {}
    override def onUserProfileUpdate(l: Long, user: User): Unit = {}
    override def onException(e: Exception): Unit = {}
    override def onUserListMemberDeletion(l: Long, user: User, user1: User, userList: UserList): Unit = {}
    override def onUserDeletion(l: Long, l1: Long): Unit = {}
    override def onDisconnectionNotice(s: String): Unit = {}
    override def onRetweetedRetweet(user: User, user1: User, status: Status): Unit = {}
    override def onFavoritedRetweet(user: User, user1: User, status: Status): Unit = {}
    override def onDeletionNotice(l: Long, statusDeletionNotice: StatusDeletionNotice): Unit = {}
    override def onDeletionNotice(l: Long, l1: Long, l2: Long): Unit = {}
    override def onFavorite(l: Long, user: User, user1: User, status: Status): Unit = {}
    override def onUnfavorite(l: Long, user: User, user1: User, status: Status): Unit = {}
    override def onStatus(l: Long, status: Status): Unit = {}
    override def onUserSuspension(l: Long, l1: Long): Unit = {}
    override def onUserListDeletion(l: Long, user: User, userList: UserList): Unit = {}
    override def onUserListCreation(l: Long, user: User, userList: UserList): Unit = {}
  }

  def statusListener = new StatusListener() {
    override def onStatus(status: Status) { println(status.getText) }
    override def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice) {}
    override def onTrackLimitationNotice(numberOfLimitedStatuses: Int) {}
    override def onException(ex: Exception) { logger.error("Unable to listen to status stream " + ex ) }
    override def onScrubGeo(arg0: Long, arg1: Long) {}
    override def onStallWarning(warning: StallWarning) {}
  }

  def userStreamListener = new UserStreamListener {
    override def onFriendList(longs: Array[Long]): Unit = {}
    override def onUserListUnsubscription(user: User, user1: User, userList: UserList): Unit = {}
    override def onBlock(user: User, user1: User): Unit = {}
    override def onUserListSubscription(user: User, user1: User, userList: UserList): Unit = {}
    override def onFollow(user: User, user1: User): Unit = {}
    override def onUserListMemberAddition(user: User, user1: User, userList: UserList): Unit = {}
    override def onDirectMessage(directMessage: DirectMessage): Unit = {}
    override def onUnblock(user: User, user1: User): Unit = {}
    override def onUserListUpdate(user: User, userList: UserList): Unit = {}
    override def onUnfollow(user: User, user1: User): Unit = {}
    override def onUserProfileUpdate(user: User): Unit = {}
    override def onUserListMemberDeletion(user: User, user1: User, userList: UserList): Unit = {}
    override def onUserDeletion(l: Long): Unit = {}
    override def onRetweetedRetweet(user: User, user1: User, status: Status): Unit = {}
    override def onFavoritedRetweet(user: User, user1: User, status: Status): Unit = {}
    override def onDeletionNotice(l: Long, l1: Long): Unit = {}
    override def onFavorite(user: User, user1: User, status: Status): Unit = {}
    override def onQuotedTweet(user: User, user1: User, status: Status): Unit = {}
    override def onUnfavorite(user: User, user1: User, status: Status): Unit = {}
    override def onUserSuspension(l: Long): Unit = {}
    override def onUserListDeletion(user: User, userList: UserList): Unit = {}
    override def onUserListCreation(user: User, userList: UserList): Unit = {}
    override def onStallWarning(stallWarning: StallWarning): Unit = {}
    override def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice): Unit = {}
    override def onScrubGeo(l: Long, l1: Long): Unit = {}
    override def onStatus(status: Status): Unit = {}
    override def onTrackLimitationNotice(i: Int): Unit = {}
    override def onException(ex: Exception): Unit = { logger.error("Unable to listen to user stream " + ex ) }
  }

//  def main(args: Array[String]) {
//    val twitterStream = new TwitterStreamFactory(twitterConfig).getInstance
//    twitterStream.addListener(rawMessageListener)
//    twitterStream.addListener(statusListener)
//    twitterStream.sample()
//    Thread.sleep(6000)
//    twitterStream.cleanUp()
//    twitterStream.shutdown()
//  }
}
