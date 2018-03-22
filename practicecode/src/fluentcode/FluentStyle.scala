package fluentcode


class FluentStyle {

  /**
    * if we will not specify this.type as return type then we cannot continue the chain of method calls when using the object of sub class to call this method
    * as it will return us the object of FluentStyle class. So this.type will return the object of the calling class(in our case it is SubClass)
    */
  def printName(myName: String): this.type = {
    println(myName)
    this
  }

  def printAddress(myAddress: String): this.type = {
    println(myAddress)
    this
  }
}

class SubClass extends FluentStyle {

  def printLocation(myLocation: String): FluentStyle = {
    println(myLocation)
    this
  }
}

object MyFluentStyle extends App {

  //  val fluentStyle = new FluentStyle
  //  fluentStyle.printName("Akhil").printAddress("13-D")

  val subClass = new SubClass

  subClass.printAddress("13-D").printLocation("Delhi")
}