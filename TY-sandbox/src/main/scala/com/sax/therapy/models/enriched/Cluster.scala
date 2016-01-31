package com.sax.therapy.models.enriched

import org.elasticsearch.search.aggregations.support.format.ValueFormat.DateTime

/**
  * Created by therapy2 on 1/30/16.
  */
case class Cluster(
                  cluster_id: String,
                  created_at: DateTime,
                  merged_at: DateTime,
                  cluster_size: Int,
                  merge_count: Int,
                  topic: String,
                  summary: String,
                  scores: Scores,
                  tweets: Seq[String] = Seq.empty,
                  people: Seq[EntityMap] = Seq.empty,
                  places: Seq[EntityMap] = Seq.empty,
                  orgs: Seq[EntityMap] = Seq.empty,
                  hashtags: Seq[EntityMap] = Seq.empty,
                  mentions: Seq[EntityMap] = Seq.empty,
                  urls: Seq[EntityMap] = Seq.empty,
                  unit_clusters: Seq[UnitCluster],
                  verification_history: Seq[ScoreHistory]
                  ) extends EnrichedObject
