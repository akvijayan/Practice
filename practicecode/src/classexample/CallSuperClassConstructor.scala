package classexample


class CallSuperClassConstructor(val name: String, val age: Int) {

println(s"Inside CallSuperClassConstructor $name and $age")
}

class Child(name: String) extends CallSuperClassConstructor(name, 0) {

  println(s"Inside Child $name and $age")
}

object MyObject extends App {

  val child = new Child("Akhil")
}