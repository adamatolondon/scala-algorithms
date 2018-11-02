package com.algorithms.tree

import scala.collection.immutable.Set

object LevelOrderTraversalRecursive {
  private def findDistinctRecursive(tree: Tree, values: Set[Int]): Int = {
    if (tree.left.isEmpty && tree.right.isEmpty)
      values.size
    else {
      val maxLeftRight = (t: Option[Tree]) => {
        t.isEmpty match {
          case true  => 0
          case false => findDistinctRecursive(t.get, values + t.get.x)
        }
      }

      Math.max(maxLeftRight(tree.left), maxLeftRight(tree.right))
    }
  }

  def findMaxDistinctValuesRecursive(tree: Tree): Int = {
    val values = Set(tree.x)
    findDistinctRecursive(tree, values)
  }
}
