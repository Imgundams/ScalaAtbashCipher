/*
Created by DRain on 18/07/2017.
*/

import org.scalatest._


class Tests extends FlatSpec with Matchers {
val main = new Main

  "The given example1 input" should "return the correct string" in {
    val input = "foobar\nwizard\ngsrh rh zm vcznkov lu gsv zgyzhs xrksvi"
    main.encodeString(input) shouldBe "ullyzi\ndraziw\nthis is an example of the atbash cipher"
  }

  "The given example2 input" should "return the correct string" in {
    val input = "wizard"
    main.encodeString(input) shouldBe "draziw"
  }

  "The given example3 input" should "return the correct string" in {
    val input = "wizard"
    main.encodeString(input) shouldBe "draziw"
  }

  "The given example3 input with a non standard char" should "return the correct string" in {
    val input = "wizard!"
    main.encodeString(input) shouldBe "draziw!"
  }


}