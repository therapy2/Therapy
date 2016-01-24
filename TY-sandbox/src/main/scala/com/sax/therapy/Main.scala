package com.sax.therapy

import akka.actor.{ActorSystem, Props}
import com.sax.therapy.stream.TwitterStreamActor

/**
  * Created by therapy2 on 1/24/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("TwitterStream")
    val mainActor = system.actorOf(Props[TwitterStreamActor], "TwitterStreamActor")
  }
}
