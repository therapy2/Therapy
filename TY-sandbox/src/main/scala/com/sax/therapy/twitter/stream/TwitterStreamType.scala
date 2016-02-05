package com.sax.therapy.twitter.stream

import com.sax.therapy.models._
import com.sax.therapy.twitter.TwitterListeners
import twitter4j.TwitterStream

/**
  * Created by therapy2 on 1/24/16.
  */
trait TwitterStreamType {
  def addStreamListener(twitterStream: TwitterStream): Unit
}

case class RawMessage() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.rawMessageListener(Raw_Stream))
}

case class SiteStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.siteStreamListener(Site_Stream))
}

case class StatusStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.statusListener(Status_Stream))
}

case class UserStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.userStreamListener(User_Stream))
}
