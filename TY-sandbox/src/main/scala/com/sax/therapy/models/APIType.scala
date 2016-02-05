package com.sax.therapy.models

/**
  * Created by therapy2 on 2/5/16.
  * Possible types of API streams.
  */
trait APIType {}
case object Raw_Stream extends APIType {
  override def toString: String = "raw_stream"
}
case object Site_Stream extends APIType {
  override def toString: String = "site_stream"
}
case object Status_Stream extends APIType {
  override def toString: String = "status_stream"
}
case object User_Stream extends APIType {
  override def toString: String = "user_stream"
}
case object Raw_Filter extends APIType {
  override def toString: String = "raw_filter"
}
case object Site_Filter extends APIType {
  override def toString: String = "site_filter"
}
case object Status_Filter extends APIType {
  override def toString: String = "status_filter"
}
case object User_Filter extends APIType {
  override def toString: String = "user_filter"
}
