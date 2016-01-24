package com.sax.therapy

import com.sax.therapy.Constants._
import com.typesafe.config.ConfigFactory

/**
  * Created by therapy2 on 1/24/16.
  * Connection config for Twitter.
  */
package object conn {
  val config = ConfigFactory.load(confName)
  val consumerKey = config.getString(consumerKeyField)
  val consumerSecret = config.getString(consumerSecretField)
  val accessToken = config.getString(accessTokenField)
  val accessTokenSecret = config.getString(accessTokenSecretField)
  val twitterConfig = new twitter4j.conf.ConfigurationBuilder()
    .setOAuthConsumerKey(consumerKey)
    .setOAuthConsumerSecret(consumerSecret)
    .setOAuthAccessToken(accessToken)
    .setOAuthAccessTokenSecret(accessTokenSecret)
    .build
}
