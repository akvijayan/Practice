package traittrickyconcept

/**
The below code will through NullPointerException because when we extend BaseTrait in a sub class or trait(in our case it is an object i.e SuperObject)
which override a field in the base trait that is manupulated in the BaseTrait in the primary constructor part it throughs a NULL Exception
trait BaseTrait {

  lazy val list = List(1, 2, 3)
  list.map(value => value + 1)
}

object SuperObject extends App with BaseTrait {

  override lazy val list: List[Int] = List(5, 6, 7)
}
**/
trait BaseTrait {

  lazy val list = List(1, 2, 3)
  list.map(value => value + 1)
}

object SuperObject extends App with BaseTrait {

  override lazy val list: List[Int] = List(5, 6, 7)
}
