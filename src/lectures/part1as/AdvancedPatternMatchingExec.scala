package lectures.part1as

/** Created by Daniel.
  */
object AdvancedPatternMatchingExec extends App {
  object singleDigit {
    def unapply(n: Int) = n >= 0 && n < 10
  }

  object even {
    def unapply(n: Int) = n % 2 == 0
  }

  val n = 9
  val mathProperty = n match {
    case singleDigit() => "single digit"
    case even()        => "even"
    case _             => "no property"
  }

  println(mathProperty)
}