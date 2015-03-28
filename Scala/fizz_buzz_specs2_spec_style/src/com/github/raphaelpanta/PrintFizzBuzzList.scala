package com.github.raphaelpanta

object PrintFizzBuzzList extends App {

  override def main(args: Array[String]): Unit = {
     val numbers = List range(1, 101)
     val fizzBuzz = new FizzBuzz 
     val result = fizzBuzz fizzBuzzList numbers
     
     result.foreach { number => println(number) }
  }
}