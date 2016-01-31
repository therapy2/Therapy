package com.sax.therapy.models.enriched

import java.util.Date

/**
  * Created by therapy2 on 1/30/16.
  */
case class User(
                created_at: Date,
                contributors_enabled: Boolean,
                description: Option[String] = None,
                favourites_count: Int,
                followers_count: Int,
                friends_count: Int,
                geo_enabled: Boolean,
                has_profile_image: Boolean,
                id_long: Long,
                id_str: String,
                is_default_profile: Boolean,
                is_protected: Boolean,
                is_translator: Boolean,
                is_verified: Boolean,
                language: String,
                listed_count: Int,
                location: Option[String] = None,
                name: Option[String] = None,
                screen_name: String,
                statuses_count: Int,
                url: Option[String] = None,
                user_avatar: String,
                user_has_expertise: Expertise,
                utc_offset: Option[Int]
               ) extends EnrichedObject {

}
