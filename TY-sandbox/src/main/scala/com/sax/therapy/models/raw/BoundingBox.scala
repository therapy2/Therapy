package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class BoundingBox(
               coordinates: Seq[Seq[Seq[Double]]],
               `type`: String
               ) extends SocialObject
