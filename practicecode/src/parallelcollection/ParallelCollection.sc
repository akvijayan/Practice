
List(1,2,3,4).par.map(number=> number+5)

/**
  * In parallel collection executions are
  * done parallelly but the end result will
  * be in order. Lets take an example:
  */

List(1,2,3,4).par.map{ number=>
  println(number)
  number+5}
