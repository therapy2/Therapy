package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class FullName(
                first: String,
                middle: Option[String] = None,
                last: Option[String] = None,
                name: Seq[String] = Seq.empty
               ) extends EnrichedObject
