package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Mention(
                  id: Long,
                  id_str: String,
                  indices: Seq[Int],
                  name: String,
                  screen_name: String
                  ) extends SocialObject
