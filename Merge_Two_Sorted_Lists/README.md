# 题目链接

[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

# 解题思路

1. 如果有一个链表为null，则不需要merge链表，直接返回不为null的链表
2. 根据当前节点值的大小，递归地移动链表，直到有一个链表为null

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(1)
