package com.checkout.shop

import com.checkout.shop.domain.Fruit

object Checkout {

  def calculateTotal(fruits: List[Fruit]): BigDecimal =
    fruits.map(_.price).sum
}
