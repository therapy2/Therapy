package com.sax.therapy.models

/**
  * Created by therapy2 on 1/23/16.
  */
trait JsonFieldNames {
}


object TweetFieldNames extends JsonFieldNames {
  val TweetId = "tweet_id"
  val TweetDate = "tweet_date"
  val ReplyToId = "reply_to_id"
  val RetweetCount = "retweet_count"
  val FavoriteCount = "favorite_count"
  val ReplyToHandle = "reply_to_handle"
  val ReplyToTweetId = "reply_to_tweet_id"
  val UserHandle = "user_handle"
  val FriendsCount = "friends_count"
  val FollowersCount = "followers_count"
  val Retweet = "retweet"
  val Hashtags = "hashtags"
  val RetweetMetaString = "retweet_meta"
  //not field name. but a constant that is valid for Tweets
  val UrlNormalPart: String = "_normal"
  val Source = "source"
  val Geo = "geo"
  val PlaceName = "place_name"
  val PlaceCountryCode = "place_country_code"
  val ScreenName: String = "screen_name"
  val IsProtected = "is_protected"
  val IsVerified = "is_verified"
  val HasProfileImage = "has_profile_image"
  val IsDefaultProfile = "is_default_profile"
  val Location ="location"
  val Url = "url"
  val Description = "description"
  val StatusCount = "statuses_count"
  val FavorteCount = "favourites_count"
  val ListedCount = "listed_count"
  val CreatedAt = "created_at"
  val User = "user"
  val Indices = "indices"
  val Domain = "domain"
  val Urls = "urls"
  val ExpandedUrl = "expanded_url"
  val DisplayUrl = "display_url"
  val MediaUrl = "media_url"
  val IsShortUrl = "is_short_url"
  val Name = "name"
  val Type = "type"
  val Symbols = "symbols"
  val Media = "media"
  val HTEntities = "hashtag_entities"
  val MentionEntities = "mention_entities"
  val First = "first"
  val Second = "second"
  val PossiblySensitive = "possibly_sensitive"
  val IsRetweet = "is_retweet"
  val FeedbackSuffix = "_feedback"
}