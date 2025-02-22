package calculator

import org.scalatest.BeforeAndAfterEach
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.shouldBe

class ScalaCalculatorTest extends AnyFlatSpec with BeforeAndAfterEach:

  var calculator = new ScalaCalculator()

  override protected def beforeEach(): Unit =
    calculator = new ScalaCalculator()

  "Calculator" should "enter a number" in:
    calculator.enter(5)
    calculator.result shouldBe 5

  it should "add two numbers" in:
    calculator.enter(5)
    calculator.enter(3)
    calculator.add()
    calculator.result shouldBe 8

  it should "add three numbers" in:
    calculator.enter(3)
    calculator.enter(4)
    calculator.add()
    calculator.enter(-4)
    calculator.add()
    calculator.result shouldBe 3