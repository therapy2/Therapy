package com.sax.therapy.twitter.filter

import com.sax.therapy.models._
import com.sax.therapy.twitter.TwitterListeners
import twitter4j.{FilterQuery, TwitterStream}

/**
  * Created by therapy2 on 2/5/16.
  */
trait TwitterFilterType {
  def addStreamListener(twitterStream: TwitterStream): Unit
}

case class FilteredRawMessage(filter:FilterQuery) extends TwitterFilterType {
  override def addStreamListener(twitterStream: TwitterStream) = {
    twitterStream.addListener(TwitterListeners.rawMessageListener(Raw_Filter))
    twitterStream.filter(filter)
  }
}

case class FilteredSiteStream(filter: FilterQuery) extends TwitterFilterType {
  override def addStreamListener(twitterStream: TwitterStream) = {
    twitterStream.addListener(TwitterListeners.siteStreamListener(Site_Filter))
    twitterStream.filter(filter)
  }
}

case class FilteredStatusStream(filter: FilterQuery) extends TwitterFilterType {
  override def addStreamListener(twitterStream: TwitterStream) = {
    twitterStream.addListener(TwitterListeners.statusListener(Status_Filter))
    twitterStream.filter(filter)
  }
}

case class FilteredUserStream(filter: FilterQuery) extends TwitterFilterType {
  override def addStreamListener(twitterStream: TwitterStream) = {
    twitterStream.addListener(TwitterListeners.userStreamListener(User_Filter))
    twitterStream.filter(filter)
  }
}

