package com.sax.therapy.models.raw

import scala.math._

/**
  * Created by therapy2 on 1/29/16.
  */
case class BoundingBox(
               coordinates: Seq[Seq[Seq[Double]]],
               `type`: String
               ) extends RawObject {
  val validate: Boolean = {
    coordinates.size == 1 && validateCoordsBox(coordinates.head)
  }
  def validateCoordsBox(coordsBox:  Seq[Seq[Double]]): Boolean = {
      coordsBox.size == 4 && coordsBox.forall(cc => validateCoords(cc))
  }
  def validateCoords(coords: Seq[Double]): Boolean = {
    coords.size == 2 && abs(coords.head) < LAT_LIMIT && abs(coords.last) < LONG_LIMIT
  }
}

object BoundingBox {
  val empty = new BoundingBox(
    coordinates = Seq.empty,
    `type` = ""
  )
}
