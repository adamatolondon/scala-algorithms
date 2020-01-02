package com.algorithms.tree

import scala.collection.immutable.Set

/**
 * Path with maximum distinct nodes in a Binary Tree.
 *
 * @author Antonio Damato
 *
 */
object PreOrderTraversalRecursive {
  private def findDistinctRecursive(tree: BSTNode, values: Set[Int]): Int = {
    if (tree.left.isEmpty && tree.right.isEmpty)
      values.size
    else {
      val maxLeftRight = (t: Option[BSTNode]) => {
        t.isEmpty match {
          case true  => 0
          case false => findDistinctRecursive(t.get, values + t.get.x)
        }
      }

      Math.max(maxLeftRight(tree.left), maxLeftRight(tree.right))
    }
  }

  def findMaxDistinctValuesRecursive(tree: BSTNode): Int = {
    val values = Set(tree.x)
    findDistinctRecursive(tree, values)
  }
}
