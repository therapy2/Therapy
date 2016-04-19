package com.sax.therapy.yahoo

/**
  * Created by therapy2 on 4/19/16.
  */
case class Response(
                   ResultSet: ResultSet
                   ) {}

case class ResultSet(
                    Query: String,
                    Result: List[Result]
                    ) {}
case class Result(
                 symbol: String,
                 name: String,
                 exch: String,
                 `type`: String,
                 exchDisp: String,
                 typeDisp: String
                 ) {}