package universaltrait

//Like value classes, universal trait only allow to have methods
trait MyUniversalTrait extends Any {

  def number: Int
  def withExtra = number + 5
}


class MyValue(val number: Int) extends AnyVal with MyUniversalTrait