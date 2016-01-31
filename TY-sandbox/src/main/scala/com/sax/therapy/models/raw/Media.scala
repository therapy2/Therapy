package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Media(
                display_url: String,
                expanded_url: String,
                id: Long,
                id_str: String,
                indices: Seq[Int],
                media_url: String,
                media_url_https: String,
                sizes: Sizes,
                source_status_id: Long,
                source_status_id_str: String,
                `type`: String,
                url: String
                ) extends RawObject
