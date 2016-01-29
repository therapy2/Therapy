package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Coordinates(
                      coordinates: Seq[Double] = Seq.empty,
                      `type`: String
                      ) extends SocialObject
