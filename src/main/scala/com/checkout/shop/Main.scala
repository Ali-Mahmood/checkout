package com.checkout.shop

import com.checkout.shop.Checkout.calculateTotal
import com.checkout.shop.domain.{Apple, Orange}

object Main extends App {
  val total = calculateTotal(List(Apple, Apple, Orange))
  println(s"Basket total is $total")
}


