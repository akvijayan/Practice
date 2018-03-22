package variableargument


class VariableArgument {

  //varags have a property that it should be defined as the last parameter in all methods
  def getVariable(seqValue : String*) = {
    println("Type: "+ seqValue)
    seqValue.map { value =>
      println(value)
      value
    }
  }
}

object MyVariableObject extends App {

  val variableArgument = new VariableArgument
  variableArgument.getVariable("Akhil", "Vijayan")
  val list = List("Akhil", "Vijayan")
  variableArgument.getVariable(list:_*)
}
