package com.algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TreeSuite extends FunSuite {
  /* .......... 10 ...... */
  /* ......... / \ ...... */
  /* ........ 7 . 12 .... */
  /* ....... / .......... */
  /* ...... 4 ........... */
  /* ..... / \ .......... */
  /* .... 3 . 6 ......... */
  private def createSimpleTree(): Tree = {
    val treeL4_1 = Tree(6, None, None)
    val treeL4_2 = Tree(3, None, None);

    val treeL3 = Tree(4, Some(treeL4_2), Some(treeL4_1));

    val treeL2_1 = Tree(7, Some(treeL3), None);
    val treeL2_2 = Tree(12, None, None);

    val treeL1 = Tree(10, Some(treeL2_1), Some(treeL2_2));
    treeL1;
  }

  /* ............. 18 ............... */
  /* ........... / ... \ ............ */
  /* ........ 13 ....... 30 ......... */
  /* ....... / \ ....... / .......... */
  /* ...... 5 . 14 .... 20 .......... */
  /* ..... / \ ...... / . \ ......... */
  /* .... 2 . 8 .... 19 .. 25........ */
  /* ....... / \ ........ / . \ ..... */
  /* ...... 7 . 9 ...... 24 . 40 .... */
  private def createComplexTree(): Tree = {
    val treeL5_1 = Tree(7, None, None);
    val treeL5_2 = Tree(9, None, None);
    val treeL5_3 = Tree(24, None, None);
    val treeL5_4 = Tree(40, None, None);

    val treeL4_1 = Tree(2, None, None);
    val treeL4_2 = Tree(8, Some(treeL5_1), Some(treeL5_2));
    val treeL4_3 = Tree(19, None, None);
    val treeL4_4 = Tree(25, Some(treeL5_3), Some(treeL5_4));

    val treeL3_1 = Tree(5, Some(treeL4_1), Some(treeL4_2));
    val treeL3_2 = Tree(14, None, None);
    val treeL3_3 = Tree(20, Some(treeL4_3), Some(treeL4_4));

    val treeL2_1 = Tree(13, Some(treeL3_1), Some(treeL3_2));
    val treeL2_2 = Tree(30, Some(treeL3_3), None);

    val treeL1_1 = Tree(18, Some(treeL2_1), Some(treeL2_2));
    treeL1_1;
  }

  test("Simple Tree One Node") {
    val tree = Tree(7, None, None)
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
