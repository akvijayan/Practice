package practice

import scala.annotation.switch


class SwitchCase {

  val i =1
  val Two = 2

//warning as this switch case is either tableswitch nor lookupswitch
  val x = (i: @switch) match {
    case 1 => "One"
    case Two => "Two"
    case _ => "Other"
  }
}
