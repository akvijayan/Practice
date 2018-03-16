package traitexample.example4

class Greeting extends FormalGreeting with InformalGreeting {

  override def hello(): String = {
    s"Good Morning !! ${super[InformalGreeting].hello()}"
  }
}

object NewObject extends App {

  println(new Greeting().hello())
}
