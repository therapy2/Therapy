package com.sax.therapy.models.enriched

import com.sax.therapy.models.raw.{Tweet => RawTweet}
import java.util.Date

/**
  * Created by therapy2 on 1/30/16.
  */
case class Tweet(
                  social_platform: String = "Twitter",
                  created_at: Date,
                  favorite_count: Int,
                  followers_count: Int,
                  friends_count: Int,
                  hashtag_entities: Seq[Hashtag] = Seq.empty,
                  id: String,
                  is_retweet: Boolean,
                  language: String,
                  media: Seq[Media] = Seq.empty,
                  mention_entities: Seq[Mention] = Seq.empty,
                  enrichments: Enrichments,
                  place_country_code: String,
                  place_name: String,
                  possibly_sensitive: Boolean,
                  raw: RawTweet,
                  reply_to_handle: Option[String],
                  reply_to_id: Option[String],
                  reply_to_tweet_id: Option[String],
                  retweet: Option[RawTweet],
                  retweet_count: Long,
                  source: String,
                  source_id: String,
                  symbols: Seq[Symbol] = Seq.empty,
                  text: String,
                  urls: Seq[Url] = Seq.empty,
                  user: User,
                  user_handle: String,
                  user_id: String
                ) extends EnrichedObject
