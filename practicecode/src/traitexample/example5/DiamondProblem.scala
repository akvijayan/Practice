package traitexample.example5


trait Drawable {
  def draw() { }
}

trait Cowboy extends Drawable {
  override def draw() { println("Bang!") }
}

trait Artist extends Drawable {
  override def draw() { println("A pretty painting") }
}

// Note: the "with" keyword goes between type names for multiple inheritance
// You can chain on multiple "with X" clauses to mix in more traits. If a
// class is to be part of the extended type, it must be specified _before_
// the first "with X" clause.
class CowboyArtist extends Cowboy with Artist

object DiamondProblem extends App {
  new CowboyArtist().draw()
}
