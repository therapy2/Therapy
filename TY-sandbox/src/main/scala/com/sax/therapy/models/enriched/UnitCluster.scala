package com.sax.therapy.models.enriched

import org.elasticsearch.search.aggregations.support.format.ValueFormat.DateTime

/**
  * Created by therapy2 on 1/30/16.
  */
case class UnitCluster(
                      tweets: Seq[String],
                      merged_at: DateTime
                      ) extends EnrichedObject
