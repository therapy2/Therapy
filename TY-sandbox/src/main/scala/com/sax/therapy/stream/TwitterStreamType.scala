package com.sax.therapy.stream

import twitter4j.TwitterStream

/**
  * Created by therapy2 on 1/24/16.
  */
trait TwitterStreamType {
  def addStreamListener(twitterStream: TwitterStream): Unit
}

case class RawMessage() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.rawMessageListener)
}

case class SiteStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.siteStreamListener)
}

case class StatusStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.statusListener)
}

case class UserStream() extends TwitterStreamType {
  override def addStreamListener(twitterStream: TwitterStream) = twitterStream.addListener(TwitterListeners.userStreamListener)
}
