package com.algorithms.tree

import com.algorithms.tree.BSTNode
import com.algorithms.tree.BSTNode

class BST(root: Option[BSTNode]) {
  def findNode(value: Int): Option[BSTNode] = {
    findNode(root, value)
  }

  private def findNode(parent: Option[BSTNode], value: Int): Option[BSTNode] = {
    if (parent.isEmpty)
      None
    else if (value == parent.get.x)
      parent
    else if (value < parent.get.x)
      findNode(parent.get.left, value)
    else findNode(parent.get.right, value)
  }
}
