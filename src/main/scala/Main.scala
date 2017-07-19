/*
Created by DRain on 18/07/2017.
*/

import scala.util.{Failure, Success, Try}

class Main {
  val input = "foobar\nwizard\ngsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
  val cipher = Map("a" -> "z", "b" -> "y", "c" -> "x", "d" -> "w", "e" -> "v", "f" -> "u", "g" -> "t", "h" -> "s",
    "i" -> "r", "j" -> "q", "k" -> "p", "l" -> "o", "m" -> "n", "n" -> "m", "o" -> "l", "p" -> "k", "q" -> "j",
    "r" -> "i", "s" -> "h", "t" -> "g", "u" -> "f", "v" -> "e", "w" -> "d", "x" -> "c", "y" -> "b", "z" -> "a")

  def encodeString(input: String): String = {
    val zero = 0
    val inputArray = input.toLowerCase.split("")
    val output = for (i <- zero until inputArray.length) yield {
      i match {
        case _ if cipher.contains(inputArray(i)) => cipher(inputArray(i))
        case _ if !cipher.contains(inputArray(i)) => inputArray(i)
      }
    }
    output.mkString
  }
  print(encodeString(input))
}
