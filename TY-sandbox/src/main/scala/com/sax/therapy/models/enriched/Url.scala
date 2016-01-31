package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Url(
              display_url: String,
              domain: Option[String] = None,
              expanded_url: Option[String] = None,
              indices: Indices,
              is_short_url: Boolean,
              resolved_url: Option[String] = None,
              url: String
              ) extends EnrichedObject
