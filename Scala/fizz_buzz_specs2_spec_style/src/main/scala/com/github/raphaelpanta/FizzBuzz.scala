package com.github.raphaelpanta

class FizzBuzz {

  def fizzBuzz(number: Int): String = number match {
    case number if number % 15 == 0 => "FizzBuzz"
    case number if number % 3 == 0  => "Fizz"
    case number if number % 5 == 0  => "Buzz"
    case _                          => number toString
  }

  def fizzBuzzList(numbers: List[Int]): List[String] = {
    numbers.map { n => fizzBuzz(n) }
  }
}