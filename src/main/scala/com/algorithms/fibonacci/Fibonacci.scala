package com.algorithms.fibonacci

/**
 * Fibonacci sequence: F(1)=1, F(2)=1, F(n)=F(n-1) + F(n-2). <br>
 * Calculate the value for a given index.
 */
object Fibonacci {
  def value(index: Int): Int = {
    if (index < 0) throw new IllegalArgumentException

    index match {
      case 0 => 1
      case 1 => 1
      case _ => value(index - 2) + value(index - 1)
    }
  }
}
