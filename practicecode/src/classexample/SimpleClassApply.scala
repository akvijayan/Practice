package classexample


class SimpleClassApply(val name: String, val age: Int) {

  private val address = "13-D"
  println(name + " and  " + age)
}

object SimpleClassApply {

  def apply(name: String, age: Int): SimpleClassApply = new SimpleClassApply(name, age)

  def unapply(arg: SimpleClassApply): Option[String] = if(arg.name.equals("Akhil")) Some(arg.name) else None
  def unapply(arg: Int): Option[(String, Int)] = if(arg ==1) Some("One",arg) else None
  def unapply(arg: String): Boolean = if(arg.equals("True")) true else false
  def unapply(arg: Double): Option[Seq[Double]] = if(arg == 1.0) Some(List(arg)) else None
}


object MyClassObject extends App {

  val simpleClass = SimpleClassApply("Akhil", 12)

  /**
    * Unapply is called
    * Here simpleClass object will go as the parameter in the unapply method and the result will be back to the output variable.
    * If the value is present then the case is successful otherwise next case will be executed
    */
  val result = simpleClass match {
    case SimpleClassApply(output) => output
    case _ => "Invalid Input"
  }
  println(result)

  //Another example which calls the unapply method
  val SimpleClassApply(valueReturned) = simpleClass
  println(valueReturned)

  //calling the Second unapply method
  1 match {
    case SimpleClassApply(value) => println(value)
    case _ => println("No result")
  }

  //calling the Third unapply method
  "True" match {
    case SimpleClassApply() => println("True")
    case _ => println("False")
  }

  //calling the Fourth unapply method
  1.0 match {
    case SimpleClassApply(data) => println(data)
    case _ => println("No data")
  }

}