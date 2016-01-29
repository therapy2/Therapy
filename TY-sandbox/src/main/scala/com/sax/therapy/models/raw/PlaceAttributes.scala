package com.sax.therapy.models.raw

/**
  * Created by therapy2 on 1/29/16.
  */
case class PlaceAttributes(
                          street_address: Option[String] = None,
                          locality: Option[String] = None,
                          region: Option[String] = None,
                          ios3: Option[String] = None,
                          postal_code: Option[String] = None,
                          phone: Option[String] = None,
                          twitter: Option[String] = None,
                          url: Option[String] = None,
                          `app:id`: Option[String] = None
                          ) extends SocialObject