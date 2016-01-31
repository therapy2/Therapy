package com.sax.therapy.models.enriched

import org.elasticsearch.search.aggregations.support.format.ValueFormat.DateTime

/**
  * Created by therapy2 on 1/30/16.
  */
case class ScoreHistory(
                       date: DateTime,
                       score: Double
                       ) extends EnrichedObject