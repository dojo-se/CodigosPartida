package com.github.raphaelpanta.unittest

import org.junit.runner.RunWith
import org.specs2.Specification
import org.specs2.runner.JUnitRunner
import com.github.raphaelpanta.FizzBuzz
import org.specs2.execute.Result

@RunWith(classOf[JUnitRunner])
class FizzBuzzSpec extends Specification {

  val fizzBuzz = new FizzBuzz
  def is() =
    s2"""
	  Esta é um especificação de FizzBuzz
	    Quando um número é divisível
		  por 3 deve imprimir Fizz $shouldBeFizz
		  por 5 deve imprimir Buzz $shouldBeBuzz
		  pro 3 e por 5 deve imprimir FizzBuzz $shouldBeFizzBuzz
        Quando um número não é divisível
		  por 3 ou por 5 deve imprimir o próprio número $shouldBeANumber
        De uma lista de inteiros 1, 2, 3, 15, 10, 30
          deve imprimir uma lista de strings como 1, 2, Fizz, FizzBuzz, Buzz, FizzBuzz $shouldPrintAFizzBuzzList
      """

  def shouldBeFizz = {
    fizzBuzz fizzBuzz 3 must be equalTo "Fizz"
  }

  def shouldBeBuzz = {
    fizzBuzz fizzBuzz 5 must be equalTo "Buzz"
  }

  def shouldBeFizzBuzz = {
    fizzBuzz fizzBuzz 30 must be equalTo "FizzBuzz"
  }
  def shouldBeANumber = {
    fizzBuzz fizzBuzz 31 must be equalTo "31"
  }

  def shouldPrintAFizzBuzzList = {
    fizzBuzz fizzBuzzList List(1, 2, 3, 15, 10, 30) must be equalTo List("1", "2", "Fizz", "FizzBuzz", "Buzz", "FizzBuzz")
  }

}