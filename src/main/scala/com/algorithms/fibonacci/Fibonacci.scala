package com.algorithms.fibonacci

/**
 * Fibonacci sequence: F(1)=1, F(2)=1, F(n)=F(n-1) + F(n-2). <br>
 * Calculate the value for a given index.
 */
object Fibonacci {
  def value(index: Int): Int = {
    if (index < 0) throw new IllegalArgumentException

    if (index == 0 || index == 1)
      return 1

    var n1 = 0
    var n2 = 0
    var value = 0
    var i = 0
    for (i <- 0 until index) {
      if (i == 0)
        n1 = 1
      else if (i == 1) n2 = 1

      value = n1 + n2
      n2 = n1
      n1 = value
      println("value=" + value)
    }

    return value
  }
}
