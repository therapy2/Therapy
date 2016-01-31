package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Media(
                display_url: String,
                id: Long,
                indices: Indices,
                media_url: String,
                `type`: String,
                url: String
                ) extends EnrichedObject
