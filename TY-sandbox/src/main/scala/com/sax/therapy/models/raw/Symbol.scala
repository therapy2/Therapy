package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/30/16.
  */
case class Symbol(
                 text: String,
                 indices: Seq[Int]
                 ) extends RawObject
