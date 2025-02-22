package calculator

class ScalaCalculator:
  private var _numbers: Seq[Int] = Seq()
  private var _result = 0
  
  def enter(number: Int): Unit = _numbers = number +: _numbers
  
  def add(): Unit =
    _numbers = _numbers.sum +: _numbers
    _numbers = _numbers.dropRight(2)

  def result: Int = _numbers.head