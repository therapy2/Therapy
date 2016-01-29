package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Place(
                  attributes: PlaceAttributes,
                  bounding_box: BoundingBox,
                  country: String,
                  country_code: String,
                  full_name: String,
                  id: String,
                  name: String,
                  place_type: String,
                  url: String,
                  contained_within: Seq[Place],
                  centroid: Seq[Double] = Seq.empty,
                  polylines: Seq[String] = Seq.empty
                ) extends SocialObject