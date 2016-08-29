# 题目链接

[Insert Interval](https://leetcode.com/problems/insert-interval/)

# 解题思路

1. 第[15行代码]()的作用是：如果newInterval与列表中的区间有重叠部分，则找出第一个重叠元素;否则，找出最后一个newInterval.start <= intervals.get(i).end的元素。
2. 第[21行代码]()的作用是：找到第一个newInterval.end < intervals.get(i).start 的元素，并删掉这之间的元素

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(1)
