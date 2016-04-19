package com.sax.therapy.yahoo

import org.json4s.DefaultFormats
import org.json4s.native.Serialization._

/**
  * Created by therapy2 on 4/19/16.
  * Given a company name, extracts its ticker symbol in various indexes
  */
object TickerExtractor {
  def find(companyName: String): Response = {
    implicit val formats = DefaultFormats
    val responseString: String = scala.io.Source.fromURL(host + companyName.replace(" ", "+")).getLines.mkString("\n")
    println(responseString)
    read[Response](responseString)
  }
}
