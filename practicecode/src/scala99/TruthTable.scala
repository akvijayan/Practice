package scala99

//Higher Order function
class TruthTable {

  def and(value1: Boolean, value2: Boolean): Boolean = {
    if(value1 && value2) true else false
  }

  def or(value1: Boolean, value2: Boolean): Boolean = {
    if(value1 || value2) true else false
  }

  def table2(f: (Boolean, Boolean) => Boolean, value1: Boolean, value2: Boolean) = {

    f(value1,value2)
  }
}

object MyTruthTable extends App {
  val truthTable = new TruthTable
  val value1 = true
  val value2 = true
  println(truthTable.table2(truthTable.and, true, false))
}