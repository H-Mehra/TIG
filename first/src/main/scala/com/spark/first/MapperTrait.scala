package com.spark.first

trait MapperTrait {
  def map(place:PlaceEntity, user:UserEntity):Option[Double]
}