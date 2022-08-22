import com.checkout.shop.Checkout
import com.checkout.shop.domain.{Apple, Orange}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CheckoutSpec extends AnyFlatSpec with Matchers {

  it should "calculate the price of a single fruit" in {
    val fruits = List(Apple)

    Checkout.calculateTotal(fruits) should ===(0.60)
  }

  it should "calculate the price of multiple fruit" in {
    val fruits = List(Apple, Orange)

    Checkout.calculateTotal(fruits) should ===(0.85)
  }

  it should "Handle an empty basket" in {
    val fruits = Nil

    Checkout.calculateTotal(fruits) should ===(0)
  }

  it should "Apply the buy 1 get 1 free offer" in {
    val fruits = List(Apple, Apple)

    Checkout.calculateTotal(fruits) should ===(0.60)
  }

  it should "Apply the three for two offer" in {
    val fruits = List(Orange, Orange, Orange, Orange)

    Checkout.calculateTotal(fruits) should ===(0.75)
  }

  it should "Apply all offers" in {
    val fruits = List(Orange, Orange, Orange, Orange, Apple, Apple, Apple)

    Checkout.calculateTotal(fruits) should ===(1.95)
  }

}
