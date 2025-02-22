package calculator

import io.cucumber.scala.{EN, ScalaDsl}

class ScalaCalculatorSteps extends ScalaDsl with EN:
  private var calculatorOption: Option[ScalaCalculator] = None

  private def calculator: ScalaCalculator = calculatorOption.get

  Given("I have a Calculator in scala"):
    () => calculatorOption = Option(new ScalaCalculator())

  Given("I add {int} and {int} in scala"):
    (arg0: Int, arg1: Int) =>
      calculator.enter(arg0)
      calculator.enter(arg1)
      calculator.add()

  Given("I add {int} and {int} and {int} in scala"):
    (arg0: Int, arg1: Int, arg2: Int) =>
      calculator.enter(arg0)
      calculator.enter(arg1)
      calculator.add()
      calculator.enter(arg2)
      calculator.add()

  Given("the result should be {int} in scala"):
    (arg0: Int) =>
      assert(calculator.result == arg0)