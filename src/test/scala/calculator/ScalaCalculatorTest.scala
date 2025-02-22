package calculator

import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.shouldBe

class ScalaCalculatorTest extends AnyFlatSpec with BeforeAndAfterEach:

  var calculator = new ScalaCalculator()

  override protected def beforeEach(): Unit =
    calculator = new ScalaCalculator()

  "Calculator" should "enter a number" in:
    val calculator = new ScalaCalculator()
    calculator.enter(5)
    calculator.result shouldBe 5
