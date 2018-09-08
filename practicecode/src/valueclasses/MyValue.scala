package valueclasses

import universaltrait.MyUniversalTrait

/**
  * Value classes are same as any class but it contains AnyVal. We need to extend AnyVal with
  * the class or case class which we are using.
  *
  * By using AnyVal the compiler can optimise the code which is not possible with the normal
  * class. By using AnyVal the case classes are not instantiated and we can use the parameter
  * anywhere. Value classes have a condition that it should only have one val parameter.
  */

//The type at compile time is MyValue, but at runtime, the representation is an Int
case class MyValue(number: Int) extends AnyVal  //val keyword is not necessary here as case class parameters are by default val


//Examples of class which are not Value class

//1) case class TwoVal(name: String, var number: Int) extends AnyVal  //Error: Value classes can have only one parameter and that should be a val

//2) class NonValParameter(name: String) extends AnyVal  //Error: Value classes can have only one non-private val parameter


//A value class can define defs, but no vals, vars, or nested traits classes or objects.
//withExtra will be a static method as MyValue will not be instantiated and we are extending AnyVal.
class MyValueWithMethod(val number: Int) extends AnyVal {
  def withExtra = number + 5
}

/** Reference for below is from https://stackoverflow.com/questions/40704525/scala-value-class-use-cases
  *
  * One big use case is type safety. Let's say you have function that can multiply money, like so:
  *
  * def multiply(factor: Int, amount: Int): Int = ???
  *
  * The problem with this is that it would be very easy to confuse the two arguments and therefore call the function incorrectly. With values classes, you could create a Money type and re-write the function like so:
  *
  * case class Money(amount: Int) extends AnyVal
  * def multiply(factor: Int, amount: Money): Money = ???
  *
  * Now with your special Money type, the compiler will tell you if you try to pass arguments in the wrong order.
  */

/**
  * Sometimes value classes are actually instantiated, in particularly:
  *
  * 1) In case of runtime type tests such as pattern matching.
  * 2) When treated as another type.
  * Demonstrative example: in println(myValue) println has a parameter of type Any, so myValue of a value class will be actually allocated and then converted to Any. Do println(myValue.toString) instead.
  * 3) In case of assignment to an array.
  */

//implicit value classes are useful to use
object ImplicitValueClass extends App {

  implicit class Addition(val value: Int) extends AnyVal {
    def add = 42 + value
  }

  println(1.add)
}

//Any value can extend universal trait
class MyValueWithUniversalTrait(val number: Int) extends AnyVal with MyUniversalTrait