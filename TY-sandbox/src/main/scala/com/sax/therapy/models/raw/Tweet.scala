package com.sax.therapy.models.raw

import java.text.SimpleDateFormat
import java.util.{Locale, Date}
import com.sax.therapy.enrich.util.Converter
import com.sax.therapy.models.enriched.{Tweet => EnrichedTweet}

/**
  * Created by therapy2 on 1/29/16.
  * Raw json object, presented the same way as it is ingested by the Streaming API.
  */
case class Tweet(
                  contributors: Seq[Contributor] = Seq.empty,
                  coordinates: Option[Coordinates] = None,
                  created_at: String,
                  current_user_retweet: Option[TweetId] = None,
                  entities: Option[Entities] = None,
                  favorite_count: Int = 0,
                  favorited: Boolean = false,
                  filter_level: Option[String] = None,
                  id: Long,
                  id_str: String,
                  in_reply_to_screen_name: Option[String] = None,
                  in_reply_to_status_id: Option[Long] = None,
                  in_reply_to_status_id_str: Option[String] = None,
                  in_reply_to_user_id: Option[Long] = None,
                  in_reply_to_user_id_str: Option[String] = None,
                  is_quote_status: Boolean = false,
                  lang: Option[String] = None,
                  place: Option[Place] = None,
                  possibly_sensitive: Boolean = false,
                  quoted_status_id: Option[Long] = None,
                  quoted_status_id_str: Option[String] = None,
                  quoted_status: Option[Tweet] = None,
                  scopes: Option[String] = None,
                  retweet_count: Long = 0,
                  retweeted: Boolean = false,
                  retweeted_status: Option[Tweet] = None,
                  source: String,
                  symbols: Seq[Symbol] = Seq.empty,
                  text: String,
                  truncated: Boolean = false,
                  user: User,
                  withheld_copyright: Boolean = false,
                  withheld_in_countries: Seq[String] = Seq.empty,
                  withheld_scope: Option[String] = None
                ) extends RawObject
{
  val enrich: EnrichedTweet = {
    new EnrichedTweet(
      social_platform = "Twitter",
      created_at = twitterDateFormat.parse(created_at),
      favorite_count = favorite_count,
      followers_count = user.followers_count,
      friends_count = user.friends_count,
      hashtag_entities = Converter.toHashtagEntities(entities.getOrElse(Entities.empty)),
      id = id.toString,
      is_retweet = retweeted,
      language = lang.getOrElse(""),
      media = Converter.toMedia(entities.getOrElse(Entities.empty)),
      mention_entities = Converter.toMentionEntitites(entities.getOrElse(Entities.empty)),
      enrichments = Converter.toEnrichments,
      place_country_code = place.getOrElse(Place.empty).country_code,
      place_name = place.getOrElse(Place.empty).name,
      possibly_sensitive = possibly_sensitive,
      raw = this,
      reply_to_handle = in_reply_to_screen_name,
      reply_to_id = in_reply_to_user_id_str,
      reply_to_tweet_id = in_reply_to_status_id_str,
      retweet = retweeted_status,
      retweet_count = retweet_count,
      source = source,
      source_id = id_str,
      symbols = Converter.toSymbols(entities.getOrElse(Entities.empty)),
      text = text,
      user = user.enrich,
      user_handle = user.screen_name,
      user_id = user.id_str
    )
  }
}
