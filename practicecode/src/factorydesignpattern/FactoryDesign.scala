package factorydesignpattern

trait Animal {
  def speak
}

object FactoryDesign {

  private class Dog extends Animal {
    override def speak { println("woof") }
  }

  private class Cat extends Animal {
    override def speak { println("meow") }
  }

  // our 'factory' method
  def apply(s: String):Animal = {
    if (s == "dog") return new Dog
    else return new Cat
  }
}

object MyFactoryDesign extends App {

  FactoryDesign("dog").speak
}