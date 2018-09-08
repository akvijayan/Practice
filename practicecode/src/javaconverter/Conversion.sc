import java.util.ArrayList

val javaList = new ArrayList[String]()
javaList.add("Akhil")
javaList.add("Vijayan")

//Error in the below code and we need to import javaconverter to provide interoperability
//val scalaList: Array[String] = javaList

import scala.collection.JavaConverters._
//java to scala
val scalaList:Array[String] = javaList.asScala.toArray

//scala to java
val javaArray:java.util.List[String] = scalaList.toList.asJava