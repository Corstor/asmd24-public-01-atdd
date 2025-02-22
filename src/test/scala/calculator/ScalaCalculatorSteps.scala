package calculator

import io.cucumber.scala.{EN, ScalaDsl}

class ScalaCalculatorSteps extends ScalaDsl with EN:
  Given("I have a Calculator in scala"):
    () => new ScalaCalculator()
    
  Given("I add {int} and {int} in scala"):
    (arg0, arg1) => ()
    
  Given("the result should be {int} in scala"):
    (arg0) => ()