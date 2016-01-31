package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class NamedEntity(
                      PERSON: Seq[String] = Seq.empty,
                      PLACE: Seq[String] = Seq.empty,
                      ORG: Seq[String] = Seq.empty,
                      TICKER: Seq[String] = Seq.empty
                      ) extends EnrichedObject
