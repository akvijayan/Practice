package classexample

/**
  * run using scalac -Xprint:all AbstractClassProperty.scala
  */

abstract class AbstractClassProperty {
  //Doesn't create a field for name in the resulting code
  val name: String
  //create age field with private[this] var age: Int = 13
  var age:Int = 13

  def method() = {
    println(name+ " and "+ age)
  }
}
