package typeerasure

/** Reference : https://medium.com/@sinisalouc/overcoming-type-erasure-in-scala-8f2422070d20
  * This works but it will provide a compile time warning that "abstract type pattern T is unchecked since it is eliminated by erasure"
  */
object Extractor {
  def extract[T](list: List[Any]) = list.flatMap {
    case element: T => Some(element)
    case _ => None
  }
}

object Erasure extends App {

  val list = List(1, "string1", List(), "string2")
  val result = Extractor.extract[String](list)
  println(result) // List(1, string1, List(), string2)
}

/**
  * Solution was Scala introduced Manifests somewhere around version 2.7.
  * However, they had problems with not being able to represent certain types so Scala 2.10. deprecated them in favor of the more powerful TypeTags.
  * Type tags are divided into three separate types: ClassTag, TypeTag, WeakTypeTag
  */

/**
  * ClassTag example
  * Advantage : Able to identify type
  * Disadvantage : Nested types are not handled
  */

import scala.reflect.ClassTag

object ClassTagExample {
  def extract[T](list: List[Any])(implicit tag: ClassTag[T]) = // or def extract[T: ClassTag](list: List[Any])
    list.flatMap {
      case element: T => Some(element)
      case _ => None
    }
}

object ClassTagObject extends App {
  val list: List[Any] = List(1, "string1", List(), "string2")
  val result = ClassTagExample.extract[String](list)
  println(result) // List(string1, string2)

  //weakness of Class Tag
  val list1: List[List[Any]] = List(List(1, 2), List("a", "b"))
  val result1 = Extractor.extract[List[Int]](list1)
  println(result1) // List(List(1, 2), List(a, b))
}

/**
  * TypeTag example
  * Advantage : Able to identify nested types
  * Disadvantage : they cannot be used on objects at runtime. We can use the TypeTag to get information about a certain
  * type at runtime, but we cannot use it to find out the type of some object at runtime.
  */

import scala.reflect.runtime.universe._

object Recognizer {
  def recognize[T](x: T)(implicit tag: TypeTag[T], tag2: ClassTag[T]): String =
    tag.tpe match {
      case TypeRef(utype, usymbol, args) =>
        List(utype, usymbol, args).mkString("\n")
    }
}

object TypeTagObject extends App {
  val list: List[Int] = List(1, 2)
  val list2: List[Int] = List(1,2,3)
  val result = Recognizer.recognize(list)
  println(result)
  // prints:
  //   scala.type
  //   type List
  //   List(Int)
}


