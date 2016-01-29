package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class Entities(
                    hashtags: Seq[Hashtag] = Seq.empty,
                    media: Seq[Media] = Seq.empty,
                    urls: Seq[Url] = Seq.empty,
                    user_mentions: Seq[Mention] = Seq.empty
                 ) extends SocialObject