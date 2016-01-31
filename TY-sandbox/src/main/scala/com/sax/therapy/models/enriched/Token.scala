package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Token(
                EMOTICON: Seq[String] = Seq.empty,
                NAMEDENTITY: Seq[NamedEntity] = Seq.empty,
                JUNK:  Seq[String] = Seq.empty,
                MONEY: Seq[String] = Seq.empty,
                PUNC: Seq[String] = Seq.empty,
                TERM: Seq[String]
                ) extends EnrichedObject
