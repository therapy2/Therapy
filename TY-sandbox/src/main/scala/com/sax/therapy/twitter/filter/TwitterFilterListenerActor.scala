package com.sax.therapy.twitter.filter

import akka.actor.Actor
import com.sax.therapy.conn._
import com.sax.therapy.twitter.stream.TwitterStreamListenerActor
import twitter4j.{TwitterStream, TwitterStreamFactory}

/**
  * Created by therapy2 on 2/5/16.
  * Actor in charge of running configurable listeners on the Twitter Filter API.
  */
object TwitterFilterListenerActor {
  case class ListenToFilter(listeners: TwitterFilterType)
  case class Done()
}
class TwitterFilterListenerActor extends Actor {
  lazy val twitterStream: TwitterStream = new TwitterStreamFactory(twitterConfig).getInstance
  def receive = {
    case TwitterFilterListenerActor.ListenToFilter(listener) => {
      listener.addStreamListener(twitterStream)
    }
  }

  override def postStop(): Unit = {
    twitterStream.cleanUp()
    twitterStream.shutdown()
    sender() ! TwitterStreamListenerActor.Done
  }
}
