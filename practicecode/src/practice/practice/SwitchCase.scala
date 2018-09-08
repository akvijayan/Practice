package practice.practice

import scala.annotation.switch


class SwitchCase {

  val i =1
  val Two = 2

//warning as this switch case is either tableswitch nor lookupswitch
  //use javap -c SwitchCase to check whether the switch is tableswitch or lookupswitch
//  val x = (i: @switch) match {
//    case 1 => "One"
//    case Two => "Two"
//    case _ => "Other"
//  }

//Scala compile automatically optimise pattern match based on primitive types.
  // It creates a Jump table which directly jump to case without going to each and
  // every case. Example:
  (5: @switch) match {   //to be use that this create a jump table we can use @switch annotation
    case 3 => "three"
    case 5 => "five"
    case _ => "Not a number"
  }

  //Another Example

  case class Test(name: String)

  (Test("Akhil"): @switch) match {   //There will be a warning the this cannot be optimised as it is not a primitive type
    case Test("Akhil") => "Akhil"
    case Test("Ravi") => "Ravi"
    case _ => "No Name"
  }

  //But if we have only two cases in the above example then scala optimises the code to the jump table

//type erasure
val list: List[Int] = List(1,2,3,4,5)

  val x = list match {
    case Nil => "One"
    case s: List[String @unchecked] => "Two"
    case _ => "Other"
  }

  //Solution for type erasure
//  import scala.reflect.runtime.universe._
//  def matchList[A: TypeTag](list: List[A]) = list match {
//    case strlist: List[String @unchecked] if typeOf[A] =:= typeOf[String] => println("A list of strings!")
//    case intlist: List[Int @unchecked] if typeOf[A] =:= typeOf[Int] => println("A list of ints!")
//  }
//
//  matchList(list)
}
