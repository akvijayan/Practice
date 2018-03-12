package practice

/**
  * run using scalac -Xprint:parse ForTranslation.scala
   */
class ForTranslation {
  /** convert to foreach i.e output: 1.to(10).foreach(((i) => println(i)))**/
  for (i <- 1 to 10) println(i)

  /** convert to withFilter and foreach i.e output: 1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).foreach(((i) => println(i)))**/
  for {
    i <- 1 to 10
    if i % 2 == 0
  } println(i)

  /** convert to withFilter and foreach i.e output: 1.to(10).withFilter(((i) => i.$bang$eq(1))).withFilter(((i) => i.$percent(2).$eq$eq(0))).foreach(((i) => println(i)))**/
  for {
    i <- 1 to 10
    if i != 1
    if i % 2 == 0
  } println(i)

  /** convert to map i.e output: 1.to(10).map(((i) => i))**/
  for { i <- 1 to 10 } yield i

  /** convert to withFilter and map i.e output: 1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).map(((i) => i))**/
  for {
    i <- 1 to 10
    if i % 2 == 0
  } yield i
}
