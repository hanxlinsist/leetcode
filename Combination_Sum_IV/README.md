# 题目链接

[Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/)

动态规划有两种等价的实现方法：

1. 带备忘的自顶向下法（Top-Down with memoization）
2. 自底向上法（bottom-up method）

# Top-Down with memoization 版本 解题思路

如果target - nums数组中（不大于target的元素）的一个元素，我们可以把原问题分解成下面的子问题：

combinationSum4(nums, target) = combinationSum4(nums, target - nums[i])的和，这里的**i**服从约束nums[i] <= target && 0 <= i <= nums.length

根据上面的分析可以写成基本的递归式来解决问题。但是，不难看出，这里的子问题有重复的部分。举个例子，如果我们想求出combinationSum4(nums, 7)，我们有可能分解成下面两个式子：

combinationSum4(nums, 4) + combinationSum4(nums, 6)

但是，在求解combinationSum4(nums, 6)的时候，我们有可能分解成下面有两个式子：

combinationSum4(nums, 4) + combinationSum4(nums, 1)

因此，为了避免求解重复的子问题，我们需要记忆求解的子问题。我分配一个数组memo， 它的索引值为相应的target，memo[target]为对应target的组合数。

递归的base case：当target == 0时，返回1，这是因为当target == 0时，target = nums[i]，因此只有一种情况。

# 时间和空间复杂度

- 时间复杂度：O(n^2)
- 空间复杂度：O(target)

# bottom-up method 版本 解题思路

从target == 1开始求，然后2、3、4 以此类推...... 直到求到给定的target. 但是这个版本的速度要比上面的版本慢，这是因为不管我们用没用到1 ~ target中间的值，它都把所有的中间值求了出来。而上面的版本，只求出了用到的中间值。

# 时间和空间复杂度

- 时间复杂度：O(n^2)
- 空间复杂度：O(target)
