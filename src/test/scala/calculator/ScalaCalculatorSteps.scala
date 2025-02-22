package calculator

import io.cucumber.scala.{EN, ScalaDsl}

class ScalaCalculatorSteps extends ScalaDsl with EN:
  Given("I have a Calculator in scala"):
    () => new ScalaCalculator()
    
  Given("I add {int} and {int} in scala"):
    (arg0: Int, arg1: Int) =>
      val calculator = new ScalaCalculator()
      calculator.enter(arg0)
      calculator.enter(arg1)
      calculator.add()
    
  Given("the result should be {int} in scala"):
    (arg0: Int) =>
      val calculator = new ScalaCalculator()
      assert(calculator.result == arg0)