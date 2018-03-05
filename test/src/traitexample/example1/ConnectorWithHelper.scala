package traitexample.example1

trait ConnectorWithHelper extends Connector{

  def findDriver(): Unit = {
    println("Find driver called.")
  }
}
