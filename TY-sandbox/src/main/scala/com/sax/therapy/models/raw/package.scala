package com.sax.therapy.models

import java.text.SimpleDateFormat
import java.util.Locale

/**
  * Created by therapy2 on 1/30/16.
  */
package object raw {
  val LAT_LIMIT = 90.0
  val LONG_LIMIT = 180.0
  val twitterDateFormat = new SimpleDateFormat("eee MMM dd HH:mm:ss ZZZZ yyyy", Locale.ENGLISH)
}
