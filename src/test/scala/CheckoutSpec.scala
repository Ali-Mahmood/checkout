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
    val fruits = List(Apple, Orange, Orange, Apple)

    Checkout.calculateTotal(fruits) should ===(1.70)
  }

  it should "Handle an empty basket" in {
    val fruits = Nil

    Checkout.calculateTotal(fruits) should ===(0)
  }

}
