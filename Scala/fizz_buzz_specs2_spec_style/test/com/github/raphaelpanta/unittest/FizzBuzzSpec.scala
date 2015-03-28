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
      This is a specification of FizzBuzz
        When a number is divisible 
          by 3 it should print Fizz $shouldBeFizz
          by 5 it should print Buzz $shouldBeBuzz
          by 3 and 5 it should print FizzBuzz $shouldBeFizzBuzz
        When a number is not divisible 
          by 3 or 5 it should print the number $shouldBeANumber
        From a list of integer 1, 2, 3, 15, 10, 30
          it should print a list of Strings like 1, 2, Fizz, FizzBuzz, Buzz, FizzBuzz $shouldPrintAFizzBuzzList
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