package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Url(
              display_url: String,
              expanded_url: String,
              indices: Seq[Int],
              url: String
              ) extends SocialObject
