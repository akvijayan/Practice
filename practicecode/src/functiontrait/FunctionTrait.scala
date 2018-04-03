package functiontrait

class FunctionTrait {

  val succ = (x: Int) => x + 1
  //we can create Function1 to Function22 trait
  val anonfun1 = new Function1[Int, Int] {
    override def apply(x: Int) = x + 1
  }

  val anonfun2 = new Function2[Int, Int, Int] {
    override def apply(x: Int, y: Int) = x + y + 1
  }
  //Note: Function23 and beyond does not exists
}

object MyFunctionTrait extends App {

  val functionTrait = new FunctionTrait()
  println(functionTrait.succ(2))
  println(functionTrait.anonfun1(2))
  println(functionTrait.anonfun2(2, 3))
}