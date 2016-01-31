package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Expertise(
                    validation: Boolean,
                    categories: Seq[String] = Seq.empty
                    ) extends EnrichedObject
