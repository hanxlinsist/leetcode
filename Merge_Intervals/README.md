# 题目链接

[Merge Intervals](https://leetcode.com/problems/merge-intervals/)

# 解题思路

1. 排序-根据每个区间的start，有序以后，方便后面的操作 O(nlogn)
2. 重叠-后一个区间的start <= 前一个区间的end
3. 合并重叠区间 O(n)

# 时间和空间复杂度

- 时间复杂度：O(nlogn)
- 空间复杂度：O(n)
