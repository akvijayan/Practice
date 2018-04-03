package partiallyappliedfunction


class PartiallyAppliedFunction {

  val sum = (x: Int, y: Int, z: Int) => x + y + z

}

object MyPartiallyAppliedFunction extends App {

  val partiallyAppliedFunction = new PartiallyAppliedFunction()

  val partial = partiallyAppliedFunction.sum(2, 3, _: Int)

  println(partial(4))
}
