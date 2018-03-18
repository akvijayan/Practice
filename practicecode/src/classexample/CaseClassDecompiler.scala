package classexample

/**
  * automatically generates apply,accessors and mutator(if var),toString,unapply,equal nad hashcode and copy
  *
  * run scalac CaseClassDecompiler.scala
  * javap CaseClassDecompiler
  */

case class CaseClassDecompiler(name: String, age: Int)


object MyObject extends App {

  //apply method is called thats why we dont need to use new keyword
  val caseClass = CaseClassDecompiler("Akhil", 12)
  val caseClass1 = CaseClassDecompiler("Akhil", 12)

  //toString called
  val data= caseClass

  //unapply called. It works well when we need to extract information in match expression
  caseClass match {
    case CaseClassDecompiler(myName,myAge) => println(myName,myAge)
  }


  //equals and hashCode is called
  caseClass == caseClass1

  //copy method is called
  val newCaseClass = caseClass.copy(name = "Vijayan")
}