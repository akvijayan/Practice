package classexample


class ApplyInClassExample(x: Int) {

  def apply(y: Int) = x + y
}

object MyApplyClass extends App {

  val adder = new ApplyInClassExample(2)
  val result = adder(4) //calls apply method
  println(result)
}