package com.sax.therapy.models.enriched

import org.elasticsearch.search.aggregations.support.format.ValueFormat.DateTime

/**
  * Created by therapy2 on 1/30/16.
  */
case class Event(
                event_id: String,
                created_at: DateTime,
                start_date: DateTime,
                end_date: DateTime,
                event_size: Int,
                topic: String,
                summary: String,
                clusters: Seq[String]
                ) extends EnrichedObject
