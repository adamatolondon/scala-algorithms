package com.algorithms.fibonacci

import org.scalatest.FunSuite
import org.scalactic.source.Position.apply

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FibonacciSuite extends FunSuite {
  test("Simple") {
    assert(1 == Fibonacci.value(0))
    assert(1 == Fibonacci.value(1))
    assert(2 == Fibonacci.value(2))
    assert(3 == Fibonacci.value(3))
    assert(5 == Fibonacci.value(4))
    assert(8 == Fibonacci.value(5))
  }

  test("Exception") {
    assertThrows[IllegalArgumentException] {
      Fibonacci.value(-1)
    }
  }
}
