package com.checkout.shop

import com.checkout.shop.domain.Fruit
import com.checkout.shop.domain.Offers.*

object Checkout {

  def calculateTotal(fruits: List[Fruit]): BigDecimal =
    val originalPrice = fruits.map(_.price).sum
    originalPrice - buy1Get1Free(fruits) - threeForTwo(fruits)
}
