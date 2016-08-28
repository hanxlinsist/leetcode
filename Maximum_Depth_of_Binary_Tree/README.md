# 题目链接

[Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

# 解题思路

1. 递归base case：如果当前节点为空，Max Depth为0
2. 递归分别求出左右子树的Max Depth
3. 拿出最大的Max Depth + 1

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(1)
