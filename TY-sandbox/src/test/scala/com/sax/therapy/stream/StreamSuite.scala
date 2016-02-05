package scala.com.sax.therapy.stream

import java.text.SimpleDateFormat

import com.sax.therapy.models.raw.{Tweet, Remove, twitterDateFormat}
import org.json4s.{Formats, NoTypeHints, DefaultFormats}
import org.json4s.native.Serialization
import org.scalatest.{ShouldMatchers, FunSuite}
import org.json4s.native.Serialization._
import org.json4s.native.Serialization.{read, write}
import Tweets._
/**
  * Created by therapy2 on 1/29/16.
  * Scalatest class for Twitter's streaming api and the marshaller/unmarshaller setup for Json objects.
  */
class StreamSuite extends FunSuite with ShouldMatchers {
  implicit val formats = new DefaultFormats {
    override def dateFormatter = twitterDateFormat
  }
  val tid1 = read[Tweet](tweet1).id_str
  val tid2 = read[Tweet](tweet2).id_str
  val tid3 = read[Tweet](tweet3).id_str

  test("id for tweet1 is properly calculated") {
    tid1 should be(tweetId1)
  }

  test("id for tweet2 is properly calculated") {
    tid2 should be(tweetId2)
  }

  test("id for tweet3 is properly calculated") {
    tid3 should be(tweetId3)
  }
}