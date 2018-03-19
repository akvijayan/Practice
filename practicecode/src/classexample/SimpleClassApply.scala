package classexample


class SimpleClassApply(val name: String, val age: Int) {

  private val address = "13-D"
  println(name + " and  " + age)
}

object SimpleClassApply {

  def apply(name: String, age: Int): SimpleClassApply = new SimpleClassApply(name, age)

  def unapply(arg: SimpleClassApply): Option[String] = if(arg.name.equals("Akhil")) Some(arg.name) else None
}


object MyClassObject extends App {

  val simpleClass = SimpleClassApply("Akhil", 12)

  /**
    * Here simpleClass onject will go as the parameter in the unapply method and the result will be back to the output variable.
    * If the value is present then the case is successful otherwise next case will be executed
    */
  val result = simpleClass match {
    case SimpleClassApply(output) => output
    case _ => "Invalid Input"
  }

  println(result)
}