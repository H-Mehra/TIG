package com.spark.first

trait PlaceEntity {
  val placeId : Long
  var placeDesc : Option[String]
  var placeClsDistr : Option[Map[StereoClass, Double]]
}