package com.github.raphaelpanta.linewrapper

object Wrapper {

  implicit class StringWrapper(text: String) {
    def wrapColumnEach(maxColumn: Int): String =
      text.split(" ").reduceLeft(
        (x, xs) => if ((x.length()) % maxColumn + xs.length() >= maxColumn) { x + "\n" + xs } else { x + " " + xs })
  }
}
