package com.algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PreOrderTraversalTreeSuite extends TreeTestSuite {
  test("Simple Tree One Node") {
    val tree = BSTNode(7, None, None)
    val n = PreOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 1)
  }

  test("Simple Tree Recursive") {
    val tree = createSimpleTree()
    val n = PreOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 4)
  }

  test("Complex Tree Recursive") {
    val tree = createComplexTree()
    val n = PreOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 5)
  }
}
