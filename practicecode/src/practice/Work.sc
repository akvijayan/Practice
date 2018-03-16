//implicits

implicit val value = 1
//implicit val value1 = 1
def test(number2:Int)(implicit number:Int) = {
  number.toString
}

test(12)(2)


//implicit class

object MyObject {

  implicit class MyClass(str: String) {

    def getString(): String = {
      str
    }
    def concate(): String = {
      str + " World"
    }
  }
}

/*
###or by package object###
package object MyObject {

  implicit class MyClass(str: String) {

    def getString(): String = {
      str
    }
    def concate(): String = {
      str + " World"
    }
  }
}
*/


import MyObject._
"Hello".getString()
"Hello".concate()


//implicit to create custom string interpolation
object MyStringInterpolation {

  implicit class MyString(val str: StringContext) {

    def a(args: String) = {
      args + str.parts.mkString("")
    }
  }
}

import MyStringInterpolation._
val num = "hello"
a"$num World"



//String Interpolation
val variable = "new"
val str = s"hello $variable"

//regex
val regex = "[0-9]".r
val text = "123 Hi"
val findAllIn = regex.findAllIn(text).toList
val replaceAllIn = regex.replaceAllIn(text , "a")
val string = text.replaceAll("[0-9]", "a")

//extract part of a string using regex

val pattern = "([0-9]+) ([A-Za-z]+)".r

val pattern(number, word) = "100 Value"


//another case
val patternMatch = "([0-9]+) ([A-Za-z]+)".r
val input = "123 Akhil"

input match {
  case patternMatch(num, wd) => (num, wd)
  case _ => ("","")
}


val list = List(1,2,3,4,5,6)

list.foldLeft[Int](0)((a,b) => b + a)

//reverse
list.foldLeft[List[Int]](Nil){
  (a,b) => {
    println(a +", " + b)
    b :: a
  }
}

//remove duplicate value
val list1 = List(1,2,3,4,1,2)
list1.foldLeft[List[Int]](Nil)((acc, element) => if (acc.contains(element)) acc else acc :+ element)

for(x <- 1 to 10) println(x)
//convert to
1.to(10).foreach(((i) => println(i)))


//withFilter example

val newList = List(1,2,3,4,5,6,7,8,9,10)

newList.withFilter(element => element == 2).map(x=>x)
newList.filter(element => element == 2)

val data = Some(1)

data match {
  case value @ Some(_) => s"$value"
}


//curied function

def curiedFunct(value1: String)(value2: String): String = {
  value1+value2
}

val funct = curiedFunct("asad")(_)
funct("dssad")

//partially applied function

def partialFunct(num1: String, num2: String) = {
  num1 + num2
}

val newFunct = partialFunct("aasdasd", _:String)

newFunct("dsaf")

//call by value and call by name

def something() = {
  println("calling something")
  1 // return value
}

def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

def callByName(x: => Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

println(">>>Call by value<<<")
callByValue(something())
println(">>>Call by name<<<")
callByName(something())