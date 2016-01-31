package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Org(
              name: String,
              ticker: Option[String],
              industries: Seq[String] = Seq.empty,
              place: Place
              ) extends EnrichedObject
