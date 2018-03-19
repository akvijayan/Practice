

// It is not a good approach to create a private constructor of a class instead we need to use only the object
class MyCompanionClass private {
  private val name: String = "Akhil"
  val value: String = "123"
}

object MyCompanionClass {
    val myClass = new MyCompanionClass // constructor in private but still it object can access the class
    println(myClass.name)  //can access private values as it is a companion class
}
