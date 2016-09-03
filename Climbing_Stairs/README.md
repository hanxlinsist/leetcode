# 题目链接

[Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

动态规划有两种等价的实现方法：

1. 带备忘的自顶向下法（Top-Down with memoization）
2. 自底向上法（bottom-up method）

# Top-Down with memoization 版本 解题思路

假设我们用最直接的递归方式求解：

- base case为n = 0或1或2
- 第一种情况：我们先走1步，因此climbStairs(n - 1)
- 第二种情况：我们先走2步，因此climbStairs(n - 2)
- 合并这两种情况：结果为climbStairs(n - 1) + climbStairs(n - 2)

从上面的方式可以看出，我们求解的子问题有重叠。比如，当我们求解climbStairs(n - 1)时，我们需要求解出climbStairs(n - 2)和climbStairs(n - 3)

因此，我用HashMap记录下已经解决过的子问题，从而我们不需要重复地去求解子问题。

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(n)

# bottom-up method 版本 解题思路

从上面版本的分析中，其实这个问题与fibonacci类似，只不过base case的数不一样了。由于climbStairs(n) = climbStairs(n - 1) + climbStairs(n - 2)，因此我们可以采用bottom-up方法，从最小的子问题开始计算，一直到达最后的目标。

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(1)
