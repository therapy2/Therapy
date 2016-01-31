package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Place(
                id: String,
                name: String
                ) extends EnrichedObject

object Place {
  val empty = new Place("unknown", "unknown")
}