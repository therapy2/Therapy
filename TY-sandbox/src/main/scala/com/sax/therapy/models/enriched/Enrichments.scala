package com.sax.therapy.models.enriched

import com.sax.therapy.models.APIType

/**
  * Created by therapy2 on 1/30/16.
  */
case class Enrichments(
                      has_profanity: Boolean,
                      fact_opinion: FactOpinion,
                      sentiment: String,
                      stance: String,
                      belief: String,
                      spam_category: String,
                      risk_category: String,
                      tokens: Seq[Token],
                      channels: Seq[String] = Seq.empty,
                      stream: String
                      ) extends EnrichedObject
