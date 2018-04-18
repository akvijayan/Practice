package variableargument

/**
  * View produces a lazy collection. A view makes the result non‐ strict, or lazy.
  * This changes the resulting collection, so when it’s used with a transformer method,
  * the elements will only be calculated as they are accessed, and not “eagerly,”
  * as they normally would be.
  */
object View extends App {

  /**
    * There is no change with the foreach as view works with transformer method like map,filter
    * etc. which return value
    */
  println(">>>>>>>>>>>>>>>>>foreach without view<<<<<<<<<<<<<<<<<")
  (1 to 100).foreach(println)
  println(">>>>>>>>>>>>>>>>>foreach with view<<<<<<<<<<<<<<<<<")
  (1 to 100).view.foreach(println)


  /**
    * If you run the below code with view, it will return immediately, returning a SeqView as before.
    * But if you remove the view method call, the code block will take about 10 seconds to run.
    */
  println(">>>>>>>>>>>>>>>>>map without view<<<<<<<<<<<<<<<<<")
  val x = (1 to 100).map { e =>
    Thread.sleep(10)
    println(e * 2)
    e * 2
  }
  println(">>>>>>>>>>>>>>>>>map with view<<<<<<<<<<<<<<<<<")
  val y = (1 to 100).view.map { e =>
    Thread.sleep(10)
    println(e * 2)
    e * 2
  }
}
