# 题目链接

[Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

# 解题思路

1. 递归base case：如果当前节点为null，则min depth为0
2. 如果当前节点的左节点为null，则求出当前节点的右节点的min depth，然后 + 1
3. 如果当前节点的右节点为null，则求出当前节点的左节点的min depth，然后 + 1
4. 如果当前节点的左右节点都不为null， 则找出左右节点中最小的min depth， 然后 + 1

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(1)
