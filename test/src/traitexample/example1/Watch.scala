package traitexample.example1

class Watch(brand: String, initialTime: Long) {

  def getTime(): Long = System.currentTimeMillis() - initialTime
}
