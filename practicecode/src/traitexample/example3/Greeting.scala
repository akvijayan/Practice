package traitexample.example3

class Greeting extends FormalGreeting with InformalGreeting {

  override def hello(): String = {
    s"Good Morning !! ${super[FormalGreeting].hello()}"
  }
}

object MyObject extends App {

  println(new Greeting().hello())
}