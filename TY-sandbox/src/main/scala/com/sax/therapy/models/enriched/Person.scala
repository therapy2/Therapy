package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  */
case class Person(
                   full_name: FullName,
                   orgs: Seq[Org] = Seq.empty,
                   user: Option[User] = None
                 ) extends EnrichedObject