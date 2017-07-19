/*
Created by DRain on 18/07/2017.
*/

class Main {
  val input = "foobar\nwizard\ngsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
  val cipher: Map[Char, Char] = (('a' to 'z').toList zip ('a' to 'z').toList.reverse).toMap

  def encodeString(input: String): String = {
    val inputArray = input.toLowerCase.toCharArray
    val output = for (i <- inputArray.indices) yield {
      i match {
        case _ if cipher.contains(inputArray(i)) => cipher(inputArray(i))
        case _ => inputArray(i)
      }
    }
    output.mkString
  }

  print(encodeString(input))
}
