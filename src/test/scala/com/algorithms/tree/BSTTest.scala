package com.algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BSTTest extends TreeTestSuite {
  test("Find Node") {
    val root = BSTNode(10, None, None)
    val bst = new BST(Some(root))
    var node = bst.findNode(10)
    assert(!node.isEmpty)
    node = bst.findNode(5)
    assert(node.isEmpty)
  }

  test("Find Node Simple Tree") {
    val root = createSimpleTree
    val bst = new BST(Some(root))
    var node = bst.findNode(4)
    assert(!node.isEmpty)
    node = bst.findNode(8)
    assert(node.isEmpty)
  }
  
  test("Find Node Complex Tree") {
    val root = createComplexTree
    val bst = new BST(Some(root))
    var node = bst.findNode(9)
    assert(!node.isEmpty)
    node = bst.findNode(24)
    assert(!node.isEmpty)
  }
}
