package examples

import scala.util.Random

class RandomInsecure {
  // <yes> <report>
  val number = new Random().nextDouble()
}
