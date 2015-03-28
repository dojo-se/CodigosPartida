package com.github.raphaelpanta.unit

import org.specs2.mutable.Specification
import com.github.raphaelpanta.linewrapper.Wrapper._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WrapperTest extends Specification {

  "A frase 'I love you'" should {
    "ser quebrada na coluna 7" in {
      "I love you" wrapColumnEach 7 must equalTo("I love\nyou")
    }

    "ser quebrada na coluna 10" in {
      "I love you" wrapColumnEach 10 must equalTo("I love you");
    }

    "ser quebrada na coluna 1" in {
      "I love you" wrapColumnEach 1 must equalTo("I\nlove\nyou");
    }
  }

  "A frase 'Um pequeno jabuti xereta viu dez cegonhas felizes.'" should {
    "ser quebrada na coluna 20" in {
      "Um pequeno jabuti xereta viu dez cegonhas felizes." wrapColumnEach 20 must equalTo("Um pequeno jabuti\nxereta viu dez\ncegonhas felizes.");
    }
  }

  "A frase 'Iloveyou'" should {
    "não deve ser quebrada" in {
      "Iloveyou" wrapColumnEach 0 must equalTo("Iloveyou")
    }
  }

  "A frase ''" should {
    "retornar uma string vazia" in {
      "".wrapColumnEach(10) must equalTo("");
    }
  }
}