package classexample

class ClassParameter(name: String, age: Int) {

}

object ClassParameterObject extends App {
  val classParameter = new ClassParameter("Akhil", 25)
  //classParameter.name not accessible outside
}