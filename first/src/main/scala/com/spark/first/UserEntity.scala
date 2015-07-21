package com.spark.first

trait UserEntity {
  val userId : Long
  val userName : String
  var userDetails : Option[String]
  var userClass : Option[StereoClass]
}