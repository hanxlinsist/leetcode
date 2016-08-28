# 题目链接

[Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

# String版本 解题思路

递归base case : 节点到达根节点， 即当前节点的左右节点都为空。

由于路径用的String对象，因此每一次调用自己都会产生一个新的对象，这样开销很大。

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)

# StringBuilder版本 解题思路

由于StringBuilder是可变对象，因此每一次递归调用时，传递的都是同一个对象。如果始终用这个对象会把所有的路径连接起来，这不是我们想要的结果。我们假设第[48行](https://github.com/hanxlinsist/leetcode/blob/master/Binary_Tree_Paths/Solution.java#L48)和第[59行](https://github.com/hanxlinsist/leetcode/blob/master/Binary_Tree_Paths/Solution.java#L59) 之间的代码是求当前节点到叶子节点的路径。 因此，48行代码是设置的断点，当路径连接完以后，59行代码把StringBuilder对象恰当设置在断点处，从而继续其它路径的连接。

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)
