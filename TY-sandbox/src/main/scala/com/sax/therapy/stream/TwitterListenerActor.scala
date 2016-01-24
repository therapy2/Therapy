package com.sax.therapy.stream

import akka.actor.Actor
import com.sax.therapy.conn.twitterConfig
import twitter4j.TwitterStreamFactory

/**
  * Created by therapy2 on 1/24/16.
  * Actor in charge of running configurable listeners on the Twitter Stream API.
  */
object TwitterListenerActor {
  case class Listen(listeners: List[TwitterStreamType])
  case class Done()
}
class TwitterListenerActor extends Actor {
  lazy val twitterStream = new TwitterStreamFactory(twitterConfig).getInstance

  def receive = {
    case TwitterListenerActor.Listen(listeners) => {
      listeners.foreach {
        l => l.addStreamListener(twitterStream)
      }
      twitterStream.sample()
    }
  }

  override def postStop(): Unit = {
    twitterStream.cleanUp()
    twitterStream.shutdown()
    sender() ! TwitterListenerActor.Done
  }
}
