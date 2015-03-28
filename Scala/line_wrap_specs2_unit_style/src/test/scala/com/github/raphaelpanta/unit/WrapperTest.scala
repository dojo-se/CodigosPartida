package com.github.raphaelpanta.unit

import org.specs2.mutable.Specification
import com.github.raphaelpanta.linewrapper.Wrapper._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WrapperTest extends Specification {

  "The string 'I love you'" should {
    "be wrapped at column 7" in {
      "I love you" wrapColumnEach 7 must equalTo("I love\nyou")
    }

    "be wrapped at column 10" in {
      "I love you" wrapColumnEach 10 must equalTo("I love you");
    }

    "be wrapped at column 1" in {
      "I love you" wrapColumnEach 1 must equalTo("I\nlove\nyou");
    }
  }

  "The string 'Um pequeno jabuti xereta viu dez cegonhas felizes.'" should {
    "be wrapped at column 20" in {
      "Um pequeno jabuti xereta viu dez cegonhas felizes." wrapColumnEach 20 must equalTo("Um pequeno jabuti\nxereta viu dez\ncegonhas felizes.");
    }
  }

  "The String 'Iloveyou'" should {
    "be not be wrapped at all" in {
      "Iloveyou" wrapColumnEach 0 must equalTo("Iloveyou")
    }
  }

  "The string ''" should {
    "return a empty string" in {
      "".wrapColumnEach(10) must equalTo("");
    }
  }
}