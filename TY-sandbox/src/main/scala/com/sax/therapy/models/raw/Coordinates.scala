package com.sax.therapy.models.raw

import scala.math._

/**
  * Created by therapy2 on 1/29/16.
  */
case class Coordinates(
                      coordinates: Seq[Double] = Seq.empty,
                      `type`: String
                      ) extends RawObject {
  val validate: Boolean = {
    coordinates.size == 2 && abs(coordinates.head) < LAT_LIMIT && abs(coordinates.last) < LONG_LIMIT
  }
}
