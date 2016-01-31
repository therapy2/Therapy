package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Entities(
                    hashtags: Seq[Hashtag] = Seq.empty,
                    media: Seq[Media] = Seq.empty,
                    urls: Seq[Url] = Seq.empty,
                    user_mentions: Seq[Mention] = Seq.empty,
                    symbols: Seq[Symbol] = Seq.empty
                 ) extends RawObject

object Entities {
  val empty = new Entities()
}