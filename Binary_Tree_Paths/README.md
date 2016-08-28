# 题目链接

[Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

# String版本 解题思路

递归base case : 节点到达根节点， 即当前节点的左右节点都为空。

由于路径用的String对象，因此每一次调用自己都会产生一个新的对象，这样开销很大。

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)

# StringBuilder版本 解题思路

StringBuilder是可变对象，

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)
