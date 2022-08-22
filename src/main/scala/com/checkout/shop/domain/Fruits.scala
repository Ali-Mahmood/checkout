package com.checkout.shop.domain

sealed trait Fruit {
  val price: BigDecimal
  val name: String
}

case object Apple extends Fruit {
  override val price: BigDecimal = 0.60
  override val name: String = "Apple"
}

case object Orange extends Fruit {
  override val price: BigDecimal = 0.25
  override val name: String = "Orange"
}

