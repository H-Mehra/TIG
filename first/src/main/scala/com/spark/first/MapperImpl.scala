package com.spark.first

class MapperImpl extends MapperTrait {
  def map(place:PlaceEntity, user:UserEntity):Option[Double] = {
    return Some(place.placeClsDistr.get.get(user.userClass.get).getOrElse(0.0))
  }
}