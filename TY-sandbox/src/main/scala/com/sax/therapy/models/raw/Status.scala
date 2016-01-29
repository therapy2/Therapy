package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Status(
                 id: Long,
                 id_str: String,
                 user_id: Long,
                 user_id_str: String
                 ) extends SocialObject
