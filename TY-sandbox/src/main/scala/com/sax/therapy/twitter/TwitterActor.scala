package com.sax.therapy.twitter

import akka.actor.{Actor, Props}
import com.sax.therapy.twitter.filter.{FilteredRawMessage, TwitterFilterListenerActor}
import TwitterFilterListenerActor.ListenToFilter
import com.sax.therapy.twitter.stream.{RawMessage, TwitterStreamListenerActor}
import TwitterStreamListenerActor._
import twitter4j.FilterQuery
import collection.JavaConversions._

/**
  * Created by therapy2 on 1/24/16.
  */
class TwitterActor extends Actor{
  override def preStart(): Unit = {

    //create listener actor for streaming api
    val listeners = List(new RawMessage())
    val listener = context.actorOf(Props[TwitterStreamListenerActor], "TwitterStreamListener")
    listener ! new ListenToStream(listeners)

    //create listener actor for filtered api
    val filter = new FilteredRawMessage(new FilterQuery().track("oil", "gold", "petrol", "petroleum"))
    val filterListener = context.actorOf(Props[TwitterFilterListenerActor], "TwitterFilterListener")
    filterListener ! new ListenToFilter(filter)
  }
  def receive = {
    case Done => context.stop(self)
  }
}
