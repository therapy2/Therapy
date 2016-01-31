package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Mention(
                  id: Long,
                  indices: Indices,
                  name: String,
                  screen_name: String
                  ) extends EnrichedObject
