# 题目链接

[Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

# 解题思路

1. 把nums1数组存入到HashMap中，它的Value为当前值出现在数组中的次数
2. 遍历nums2数组，如果nums2中的元素在HashMap存在，并且次数 > 0，则把这个元素加入到ArrayList中

# 时间和空间复杂度

时间复杂度：O(m + n)
空间复杂度：O(m + n)
