# 题目链接

[Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)

# 解题思路

根据BFS把树中的每个节点装入队列中，如果当前节点的左节点是叶子节点（这个根据18行的if语句来判断），把它加入sum中。

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(n)
