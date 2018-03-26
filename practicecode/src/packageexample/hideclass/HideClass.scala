package packageexample.hideclass

//This import means that we are excluding ArrayList class and rest are included
import java.util.{ArrayList => _, _}

class HideClass {

  //We cannot access ArrayList as we hide that class in the import

  //val list = new ArrayList()
  val random = new Random()
}
