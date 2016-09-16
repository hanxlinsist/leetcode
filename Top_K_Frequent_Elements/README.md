# 题目链接

[Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

# 解题思路

1. 用HashMap：Key为数组中的元素，Value为出现的次数
2. 用HashMap中的Value构建max-heap
3. 取出前K个Entry

# 时间和空间复杂度

- 时间复杂度：O(klog(n))
- 空间复杂度：O(n)
