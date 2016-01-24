package com.sax.therapy.stream

import akka.actor.{Actor, Props}
import com.sax.therapy.stream.TwitterListenerActor._

/**
  * Created by therapy2 on 1/24/16.
  */
class TwitterStreamActor extends Actor{
  override def preStart(): Unit = {
    //create listener actor
    val listeners = List(new RawMessage())
    val listener = context.actorOf(Props[TwitterListenerActor], "TwitterListener")
    listener ! new Listen(listeners)
  }
  def receive = {
    case Done => context.stop(self)
  }
}
