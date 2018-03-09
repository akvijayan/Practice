package practice.practice


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
