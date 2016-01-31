package com.sax.therapy.models.raw

import com.sax.therapy.enrich.util.Converter
import com.sax.therapy.models.enriched.{User => EnrichedUser}

/**
  * Created by therapy2 on 1/29/16.
  */
case class User(
                 blocked_by: Boolean = false,
                 blocking: Boolean = false,
                 contributors_enabled: Boolean = false,
                 created_at: String,
                 default_profile: Boolean = false,
                 default_profile_image: Boolean = false,
                 description: Option[String] = None,
                 email: Option[String] = None,
                 entities: Option[Entities] = None,
                 favourites_count: Int,
                 follow_request_sent: Boolean = false,
                 following: Boolean = false,
                 followers_count: Int,
                 friends_count: Int,
                 geo_enabled: Boolean = false,
                 has_extended_profile: Boolean = false,
                 id: Long,
                 id_str: String,
                 is_translation_enabled: Boolean = false,
                 is_translator: Boolean = false,
                 lang: String,
                 listed_count: Int,
                 location: Option[String] = None,
                 muting: Boolean = false,
                 name: Option[String],
                 notifications: Boolean = false,
                 profile_background_color: String,
                 profile_background_image_url: String,
                 profile_background_image_url_https: String,
                 profile_background_tile: Boolean = false,
                 profile_banner_url: Option[String] = None,
                 profile_image_url: String,
                 profile_image_url_https: String,
                 profile_link_color: String,
                 profile_sidebar_border_color: String,
                 profile_sidebar_fill_color: String,
                 profile_text_color: String,
                 profile_use_background_image: Boolean = false,
                 `protected`: Boolean = false,
                 screen_name: String,
                 show_all_inline_media: Boolean = false,
                 status: Option[Tweet] = None,
                 statuses_count: Int,
                 time_zone: Option[String] = None,
                 url: Option[String] = None,
                 utc_offset: Option[Int] = None,
                 verified: Boolean = false,
                 withheld_in_countries: Option[String] = None,
                 withheld_scope: Option[String] = None
               ) extends RawObject
{
  val enrich: EnrichedUser = {
    new EnrichedUser(
      created_at = twitterDateFormat.parse(created_at),
      contributors_enabled = contributors_enabled,
      description = description,
      favourites_count = favourites_count,
      followers_count = followers_count,
      friends_count = friends_count,
      geo_enabled = geo_enabled,
      has_profile_image = !default_profile_image,
      id_long = id,
      id_str = id_str,
      is_default_profile = default_profile,
      is_protected = `protected`,
      is_translator = is_translation_enabled,
      is_verified = verified,
      language = lang,
      listed_count = listed_count,
      name = name,
      screen_name = screen_name,
      statuses_count = statuses_count,
      url = url,
      user_avatar = profile_image_url,
      user_has_expertise = Converter.toExpertise,
      utc_offset = utc_offset
    )
  }
}
