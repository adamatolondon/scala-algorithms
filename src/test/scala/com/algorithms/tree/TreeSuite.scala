package com.algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TreeSuite extends FunSuite {
  /* .......... 2 ....... */
  /* ......... / \ ...... */
  /* ........ 3 . 7 ..... */
  /* ....... / .......... */
  /* ...... 4 ........... */
  /* ..... / \ .......... */
  /* .... 5 .. 4 ........ */
  private def createSimpleTree(): Tree = {
    val treeL4_1 = Tree(4, None, None)
    val treeL4_2 = Tree(5, None, None);

    val treeL3 = Tree(4, Some(treeL4_2), Some(treeL4_1));

    val treeL2_1 = Tree(3, Some(treeL3), None);
    val treeL2_2 = Tree(7, None, None);

    val treeL1 = Tree(2, Some(treeL2_1), Some(treeL2_2));
    treeL1;
  }

  /* .......... 4 .......... */
  /* ........../.\.......... */
  /* ........ 3 . 5 ........ */
  /* ......../ \ . \........ */
  /* ...... 2 . 7 . 6 ...... */
  /* ..... / \ ... / \ ..... */
  /* .... 3 . 8 . 8 . 8 .... */
  /* ....... / \ ... / \ ... */
  /* ...... 10  9 . 4 . 4 .. */
  private def createComplexTree(): Tree = {
    val treeL5_1 = Tree(10, None, None);
    val treeL5_2 = Tree(9, None, None);
    val treeL5_3 = Tree(4, None, None);
    val treeL5_4 = Tree(4, None, None);

    val treeL4_1 = Tree(3, None, None);
    val treeL4_2 = Tree(8, Some(treeL5_1), Some(treeL5_2));
    val treeL4_3 = Tree(8, None, None);
    val treeL4_4 = Tree(8, Some(treeL5_3), Some(treeL5_4));

    val treeL3_1 = Tree(2, Some(treeL4_1), Some(treeL4_2));
    val treeL3_2 = Tree(7, None, None);
    val treeL3_3 = Tree(6, Some(treeL4_3), Some(treeL4_4));

    val treeL2_1 = Tree(3, Some(treeL3_1), Some(treeL3_2));
    val treeL2_2 = Tree(5, Some(treeL3_3), None);

    val treeL1_1 = Tree(4, Some(treeL2_1), Some(treeL2_2));
    treeL1_1;
  }

  test("Simple Tree One Node") {
    val tree = Tree(7, None, None)
    val n = LevelOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 1)
  }

  test("Simple Tree Recursive") {
    val tree = createSimpleTree()
    val n = LevelOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 4)
  }

  test("Complex Tree Recursive") {
    val tree = createComplexTree()
    val n = LevelOrderTraversalRecursive.findMaxDistinctValuesRecursive(tree)
    assert(n == 5)
  }
}
