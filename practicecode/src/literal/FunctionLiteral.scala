package literal


class FunctionLiteral {

  val result = (number: Int) => number + 1
  //or val result: (Int) => Int = (number: Int) => number + 1
  //or val result: (Int) => Int = _ + 1
  //or val result: (Int) => Int = number => number + 1
}

object MyFunctionLiteral extends App {

  val functionLiteral = new FunctionLiteral()
  println(functionLiteral.result(2))
}
