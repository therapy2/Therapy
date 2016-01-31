package com.sax.therapy

import com.sax.therapy.Constants._
import com.typesafe.config.ConfigFactory

/**
  * Created by therapy2 on 1/30/16.
  */
package object es {
  val config = ConfigFactory.load(esConfName)
  val hostName = "es.host"
  val hostVal = config.getString(hostField)
  val portName = "es.port"
  val portVal = config.getString(portField)
  val indexName = "es.index.name"
  val indexVal = config.getString(indexField)
  val indexTypeName = "es.index.type"
  val clusterName = "cluster.name"
  val clusterVal = config.getString(clusterField)
  val tweetTypeVal = "tweet"
  val userTypeVal = "user"
  val personTypeVal = "person"
  val orgTypeVal = "org"
  val clusterTypeVal = "cluster"
  val eventTypeVal = "event"
  val DateField = "date"
  val MAXSIZE = 10000
}
