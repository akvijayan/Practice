package xmlhandling

import scala.xml.Elem


class XmlHandler(val xml: Elem) {

  println(xml.getClass)
  println(xml.child.toList)
  xml.child.foreach(output =>println(output))
}

object MyXml extends App {

  val xml = <p>Hello, world</p>
  val xmlHandler = new XmlHandler(xml)
  println("_______________________________________")
  val xml1 = <p>Hello, <br/>world</p>
  val xmlHandler1 = new XmlHandler(xml1)
}
