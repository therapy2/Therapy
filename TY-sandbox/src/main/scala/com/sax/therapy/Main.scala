package com.sax.therapy

import java.net.InetAddress

import akka.actor.{ActorSystem, Props}
import com.sax.therapy.conn._
import com.sax.therapy.es._
import com.sax.therapy.models.raw.{Remove, Tweet}
import com.sax.therapy.stream.{RawMessage, Marshaller, TwitterStreamActor}
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.json4s.DefaultFormats
import org.json4s.native.Serialization._
import twitter4j.TwitterStreamFactory

/**
  * Created by therapy2 on 1/24/16.
  * Main class for stream project.
  */

object Main {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("TwitterStream")
    val streamActor = system.actorOf(Props[TwitterStreamActor], "TwitterStreamActor")

//    lazy val twitterStream = new TwitterStreamFactory(twitterConfig).getInstance
//    new RawMessage().addStreamListener(twitterStream)
//    twitterStream.sample()
  }
}
