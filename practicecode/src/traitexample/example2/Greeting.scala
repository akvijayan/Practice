package traitexample.example2

class Greeting extends FormalGreeting with InformalGreeting {

  override def hello(): String = {
    "Good Morning !!"
  }
}

object MyObject extends App {

  println(new Greeting().hello())
}