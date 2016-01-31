package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Place(
                  attributes: Map[String, String],
                  bounding_box: BoundingBox,
                  country: String,
                  country_code: String,
                  full_name: String,
                  id: String,
                  name: String,
                  geometry: Option[Coordinates] = None,
                  place_type: String,
                  url: String,
                  contained_within: Seq[Place],
                  centroid: Seq[Double] = Seq.empty,
                  polylines: Seq[String] = Seq.empty
                ) extends RawObject

object Place {
  val empty = new Place(
    attributes = Map.empty,
    bounding_box = BoundingBox.empty,
    country = "",
    country_code = "",
    full_name = "",
    id = "",
    name = "",
    geometry = None,
    place_type = "",
    url = "",
    contained_within = Seq.empty,
    centroid = Seq.empty,
    polylines = Seq.empty
  )
}