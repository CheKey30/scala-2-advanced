package lectures.part2afp

/** Created by Daniel.
  */
object PartialFunctionsExec extends App {
  val apf = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = Seq(1, 2, 3).contains(x)

    override def apply(v1: Int): Int = v1 match {
      case 1 => 1
      case 2 => 2
      case 3 => 3
    }
  }

  val dumbBot: PartialFunction[String, String] = {
    case "a" => "true"
    case "b" => "false"
  }

  scala.io.Source.stdin.getLines().foreach(l => println(s"ans = ${dumbBot(l)}"))

}