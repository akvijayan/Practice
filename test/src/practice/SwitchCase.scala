package practice

import scala.annotation.switch


class SwitchCase {

  val i =1
  val Two = 2

//warning as thsi switch case is not either tableswitch nor lookupswitch
  val x = (i: @switch) match {
    case 1 => "One"
    case Two => "Two"
    case _ => "Other"
  }
}
