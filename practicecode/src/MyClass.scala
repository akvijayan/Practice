

// It is not a good aproach to creat a private constructor of a class instead we need to use only the object
class MyClass private {
  private val name: String = "Akhil"
  val value: String = "123"
}

object MyClass {
    val myClass = new MyClass // constructor in private but still it object can access the class
    println(myClass.name)  //can access private values as it is a companion class
}
