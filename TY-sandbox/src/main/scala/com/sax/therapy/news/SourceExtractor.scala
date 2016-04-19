package com.sax.therapy.news

/**
  * Created by therapy2 on 4/19/16.
  */
object SourceExtractor {

    private val anchorWords: String = "\" (says|said|claims|claimed|quips|quipped|remarks|remarked|notes|noted)\\b"
    private val anchors: String = ".*" + anchorWords + "\\b.*"
    private val notNames: String = "^\\s(a|an|the|that)\\s.*"
    private val areNames: String = "^\\s?[a-zA-Z\\-]+\\s([a-zA-Z]\\.\\s)?[a-zA-Z\\-]+,\\s.*"
    private val endOfSentence: String = "(?<!(ms|mrs|mr|Ms|Mrs|Mr|[\\.\\s][a-zA-Z]))[\\.:\\!\\?]"
    private val affiliationFlags: List[String] = List(".*('s|s')\\s.*", " at ", " for ", " from ", " of ", " with ")

    def processAffiliation(name: String, aff: String, delim: String): Option[Professional] = {
      val sp = aff.split(delim)
      val position = sp.head.trim().replace("\"", "")
      val company = sp.tail.mkString(delim).split(",").last.trim().replace("\"", "")
      if(company.count(_.isUpper) > 0) {
        val output: Professional = new Professional(name, position, company)
        Some(output)
      }
      else
        None
    }
    def find(doc: String): Array[Professional] = {
      val splitDoc: Array[String] = doc.split(endOfSentence)
      val finds: Array[Option[Professional]] =
        for(segment <- splitDoc
            if segment.matches(anchors)
        ) yield {
          val splitSegment: String = segment.split(anchorWords).last
          if(splitSegment.matches(notNames))
            None
          else {
            if(splitSegment.matches(areNames)) {
              val splitPhrase = splitSegment.split(",")
              val name: String = splitPhrase.head.trim()
              val affiliation: String = splitPhrase.tail.mkString(",").trim()
              /* if(affiliation.matches(affiliationFlags.apply(0))) {
                 val sp = affiliation.split("('s|s')\\s")
                 val company = sp.head.trim()
                 val position = sp.tail.mkString(" ").split(",").last.trim()
                 val output: String = s"$name\t$position\t$company"
                 Some(output)
               }
               else*/
              if(!affiliation.matches(affiliationFlags.apply(0))) {
                if(affiliation.contains(affiliationFlags.apply(1))) {
                  processAffiliation(name, affiliation, affiliationFlags.apply(1))
                }
                else if(affiliation.contains(affiliationFlags.apply(2))) {
                  processAffiliation(name, affiliation, affiliationFlags.apply(2))
                }
                else if(affiliation.contains(affiliationFlags.apply(3))) {
                  processAffiliation(name, affiliation, affiliationFlags.apply(3))
                }
                else if(affiliation.contains(affiliationFlags.apply(4))) {
                  processAffiliation(name, affiliation, affiliationFlags.apply(4))
                }
                else if(affiliation.contains(affiliationFlags.apply(5))) {
                  processAffiliation(name, affiliation, affiliationFlags.apply(5))
                }
                else
                  None
              }
              else
                None
            }
            else {
              None
            }
          }
        }
      finds.flatten
    }
}
