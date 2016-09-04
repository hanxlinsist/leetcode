# 题目链接

[Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

# 解题思路

1. 把nums1数组存入到HashMap中，由于key唯一，因此我们已经去掉了重复的元素
2. 遍历nums2数组，如果nums2中的元素在HashMap存在，则加到列表中，并从map中移除，防止结果数组存在重复元素。

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)
