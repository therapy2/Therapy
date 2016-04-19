package com.sax.therapy.news

import com.sax.therapy.twitter.search.TwitterSearchActor
import com.sax.therapy.yahoo.TickerExtractor
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

import scala.xml.{Node, Elem, XML}

/**
  * Created by therapy2 on 4/19/16.
  * Reads RSS feeds from major news outlets.
  */
object RSSReader {
  val formatter = "?format=xml"
  def getDescription(l: Elem): Seq[String] = (l \\ descriptionField).map(x => x.text.replace("\n", ""))
  def getLink(l: Elem): Seq[String] = (l \\ linkField).map(x => x.text).filter(x => x.length > 1 && x != homePage)
  def getArticle(link: String): Option[String] = {
    val sourceString = scala.io.Source.fromURL(link).getLines().toList.mkString("\n")
    val doc: Document = Jsoup.parse(sourceString)
    val articleText = doc.getElementById(articleTextField)
    if(articleText != null)
      Some(articleText.text)
    else
      None
  }

  def attributeValueEquals(value: String)(node: Node) = {
    node.attributes.exists(_.value.text == value)
  }

  def findProfessionals(): Seq[Professional] = {
    val newsXmls =  newsPages.map(newsPage => XML.load(newsHost + newsPage + formatter))
    val reutersXmls = reutersPages.map(reutersPage => XML.load(reutersHost + reutersPages.head + formatter))
    val videosXmls = videoPages.map(videoPage => XML.load(videoHost + videoPages.head + formatter ))
    val blogsXmls = blogPages.map(blogPage => XML.load(blogHost + blogPages.head + formatter))
    val specialXmls = specialPages.map(specialPage => XML.load(specialPages.head + formatter))
    val links =
      newsXmls.flatMap(newsXml => getLink(newsXml)) ++
        reutersXmls.flatMap(reutersXml => getLink(reutersXml)) ++
        videosXmls.flatMap(videosXml => getLink(videosXml)) ++
        blogsXmls.flatMap(blogsXml => getLink(blogsXml)) ++
        specialXmls.flatMap(specialXml => getLink(specialXml))
    val articles: Seq[String] = links.map(link => getArticle(link).getOrElse(link + " didn't have the proper field."))
    val professionals: Seq[Professional] = articles.flatMap(article => SourceExtractor.find(article))
    professionals
  }

  def main(args: Array[String]) = {
    //findProfessionals().foreach(x => println(TickerExtractor.find(x.company).ResultSet))
    findProfessionals().foreach(x => println(TwitterSearchActor.find(x.name).mkString(" OR ")))
  }
}
