# 题目链接

[Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

# 解题思路

每次调用我们可以把它当作是一个子问题。当我们求子问题的时候，有重叠的子问题，比如：当i = 0, j = 10. 和 i = 0, j = 9.时，0 ~ 9的sum我们求了两遍，因此这里我们用自底向上法（bottom-up method）的动态规划，即我们先求出所有子问题的解。

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(1)
