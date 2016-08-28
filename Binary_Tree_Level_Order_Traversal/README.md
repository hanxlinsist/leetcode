# 题目链接

[Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

# 解题思路

1. 把同一个level的节点放入一个容器中
2. 遍历容器中的每个节点，抽取值，然后把节点的children放入到同一个level容器中
3. 重复1、2步骤

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)
