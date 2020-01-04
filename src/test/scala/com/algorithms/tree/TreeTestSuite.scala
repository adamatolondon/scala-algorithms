package com.algorithms.tree

import org.scalatest.FunSuite

class TreeTestSuite extends FunSuite {
  /* .......... 10 ...... */
  /* ......... / \ ...... */
  /* ........ 7 . 12 .... */
  /* ....... / .......... */
  /* ...... 4 ........... */
  /* ..... / \ .......... */
  /* .... 3 . 6 ......... */
  protected def createSimpleTree(): BSTNode = {
    val treeL4_1 = BSTNode(6, None, None)
    val treeL4_2 = BSTNode(3, None, None);

    val treeL3 = BSTNode(4, Some(treeL4_2), Some(treeL4_1));

    val treeL2_1 = BSTNode(7, Some(treeL3), None);
    val treeL2_2 = BSTNode(12, None, None);

    val treeL1 = BSTNode(10, Some(treeL2_1), Some(treeL2_2));
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
  /* ...... 7 . 9 ...... 24 . 27 .... */
  protected def createComplexTree(): BSTNode = {
    val treeL5_1 = BSTNode(7, None, None);
    val treeL5_2 = BSTNode(9, None, None);
    val treeL5_3 = BSTNode(24, None, None);
    val treeL5_4 = BSTNode(27, None, None);

    val treeL4_1 = BSTNode(2, None, None);
    val treeL4_2 = BSTNode(8, Some(treeL5_1), Some(treeL5_2));
    val treeL4_3 = BSTNode(19, None, None);
    val treeL4_4 = BSTNode(25, Some(treeL5_3), Some(treeL5_4));

    val treeL3_1 = BSTNode(5, Some(treeL4_1), Some(treeL4_2));
    val treeL3_2 = BSTNode(14, None, None);
    val treeL3_3 = BSTNode(20, Some(treeL4_3), Some(treeL4_4));

    val treeL2_1 = BSTNode(13, Some(treeL3_1), Some(treeL3_2));
    val treeL2_2 = BSTNode(30, Some(treeL3_3), None);

    val treeL1_1 = BSTNode(18, Some(treeL2_1), Some(treeL2_2));
    treeL1_1;
  }

}
