package com.checkout.shop.domain

object Offers {

  def buy1Get1Free(items: List[Fruit]): BigDecimal = {
    val fruitsOnOffer = items.collect {
      case apple: Apple.type => apple
    }

    fruitsOnOffer.take(fruitsOnOffer.size / 2).map(_.price).sum
  }

  def threeForTwo(items: List[Fruit]): BigDecimal = {
    val fruitsOnOffer = items.collect {
      case orange: Orange.type => orange
    }

    (fruitsOnOffer.size / 3) * Orange.price
  }

}
