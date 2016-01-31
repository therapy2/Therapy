package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Scores(
                news: Double,
                veracity: Double,
                sentiment: Double,
                stance: Double
                ) extends EnrichedObject
