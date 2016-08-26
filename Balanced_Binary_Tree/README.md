# 题目链接

[Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

# 解题思路

用递归的方法，自底向上。

定义dfsHeight方法，这个方法用dfs遍历树的每个结点，如果balanced则返回给定结点的高度，否则返回-1 

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(n)
