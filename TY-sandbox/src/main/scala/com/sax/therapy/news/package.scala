package com.sax.therapy

import java.util

import com.sax.therapy.Constants._
import com.typesafe.config.ConfigFactory

/**
  * Created by therapy2 on 4/19/16.
  */
package object news {
  val config = ConfigFactory.load(rssConfName)
  val newsHost: String = config.getString(newsHostField)
  val newsPages: Array[String] = config.getStringList(newsPagesField).toArray.map(x => x.toString)
  val reutersHost: String = config.getString(reutersHostField)
  val reutersPages: Array[String] = config.getStringList(reutersPagesField).toArray.map(x => x.toString)
  val videoHost: String = config.getString(videoHostField)
  val videoPages: Array[String] = config.getStringList(videoPagesField).toArray.map(x => x.toString)
  val blogHost: String = config.getString(blogHostField)
  val blogPages: Array[String] = config.getStringList(blogPagesField).toArray.map(x => x.toString)
  val specialPages: Array[String] = config.getStringList(specialPagesField).toArray.map(x => x.toString)

  val descriptionField = "description"
  val linkField = "link"
  val articleTextField = "articleText"

  val homePage = "http://www.reuters.com"
}
