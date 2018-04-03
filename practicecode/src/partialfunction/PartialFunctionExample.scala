package partialfunction


class PartialFunctionExample {

  val evenOdd: PartialFunction[Int, String] = {
    case value: Int if value % 2 == 0 && value != 0 => "Even"
    case value: Int if value % 2 != 0 => "Odd"
  }

  val plusOne: PartialFunction[Int, Int] = {
    case value: Int => value + 1
  }
}

object MyPartialFunctionExample extends App {

  val partialFunctionExample = new PartialFunctionExample
  if (partialFunctionExample.evenOdd.isDefinedAt(2)) {
    println("Prints Even: " + partialFunctionExample.evenOdd(2))
  }

  val handleEvenOddAndPlusOne = partialFunctionExample.evenOdd.orElse(partialFunctionExample.plusOne)
//  val handleEvenOddAndPlusOne = partialFunctionExample.evenOdd.andThen(partialFunctionExample.plusOne)

  println("Calls plusOne as evenOdd has no case matching: " + handleEvenOddAndPlusOne(0))
  println("Calls evenOdd as it has a matching case: " + handleEvenOddAndPlusOne(2))

  val list = List(0,1,2,3)

  /** when using list.map(partialFunctionExample.evenOdd) returns match error as there is no case for 0 element in the list
  solution is to use collect which is made for partial function. collect method is written to test the isDefinedAt method for each
  element it’s given. As a result, it doesn’t run the evenOdd when the input value
  is 0 (but does run it for every other element). **/
  println("Using collect to solve the problem " + list.collect(partialFunctionExample.evenOdd))
}