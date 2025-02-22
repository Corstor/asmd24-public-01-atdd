package calculator

class ScalaCalculator:
  private var _result = Option(0)
  def enter(number: Int): Unit = _result = Option(number)
  def add(): Unit = ???
  def result: Int = _result.get