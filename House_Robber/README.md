# 题目链接

[House Robber](https://leetcode.com/problems/house-robber/)

# 解题思路

假设max(i)表示前i家（包括第i家）House我今晚能偷到的最大值，nums[i]表示第i家的钱。因此我能写出如下递归式：

1. 偷第i家：max(i) = max(i - 2) + nums[i]
2. 不偷第i家：max(i - 1)

这个普通版本的程序我已经放在对应的Solution.java文件中了，供大家参考。这个版本在LeetCode中会出现Time Limit Exceeded 错误。

出现错误的原因很明显是因为我求的子问题出现了重叠的情况。因此，我们用动态规划求解这个问题。动态规划有两种等价的实现方法：

1. 带备忘的自顶向下法（Top-Down with memoization）
2. 自底向上法（bottom-up method）

我把上面两种实现都已经放在Solution.java文件中了。

# 自底向上法 版本 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(n)
