package com.sax.therapy.enrich.util

import com.sax.therapy.models.enriched._
import com.sax.therapy.models.raw.Entities


/**
  * Created by therapy2 on 1/30/16.
  * Util object for basic conversions between raw fields and enriched fields.
  */
object Converter {
  def toHashtagEntities(entities: Entities): Seq[Hashtag] = {
    entities.hashtags.map(h => new Hashtag(new Indices(h.indices.head, h.indices.last), h.text))
  }
  def toMedia(entities: Entities): Seq[Media] = {
    entities.media.map(m => new Media(m.display_url, m.id, new Indices(m.indices.head, m.indices.last), m.media_url, m.`type`, m.url))
  }
  def toMentionEntitites(entities: Entities): Seq[Mention] = {
    entities.user_mentions.map(m => new Mention(m.id, new Indices(m.indices.head, m.indices.last), m.name, m.screen_name))
  }
  def toSymbols(entities: Entities): Seq[Symbol] = {
    entities.symbols.map(s => new Symbol(s.text, new Indices(s.indices.head, s.indices.last)))
  }
  val toEnrichments: Enrichments = {
    //FIXME: to be replaced with proper modules
    new Enrichments(
      has_profanity = false,
      fact_opinion = new FactOpinion("fact", 1.0),
      sentiment = "neutral",
      stance = "neutral",
      belief = "neutral",
      spam_category = "news",
      risk_category = "none",
      tokens = Seq.empty,
      channels = Seq.empty,
      stream = "public"
    )
  }
  val toExpertise: Expertise = {
    //FIXME: implement proper conversion
    new Expertise(false, Seq.empty)
  }
}
