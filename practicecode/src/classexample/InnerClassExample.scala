package classexample

class InnerClassExample {

  case class Inner(name: String, age: Int)

  object InnerObject {
    val address = "34-D"
  }
  def sayHello(): Unit = {
    println("Hello")
  }
}

object MyObject extends App {

  val myClass = new InnerClassExample()

  //In Java, such inner classes are members of the enclosing class and in Scala, such inner classes are bound to the outer object.”
  val inner = myClass.Inner("Akhil", 12)
  val innerObject = myClass.InnerObject
}
