# 题目链接

[Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

- **数组的length设为k**
- **所有的元素设为n**

# Priority Queue 版本 解题思路

1. 把所有链表（即第一个节点，也是每个链表中的最小值）放入Priority Queue中 O(k)
2. 抽取Priority Queue中的head（即Priority Queue中的最小值） O(log(k))
3. 如果head有下一个节点，则接着把它插入到Priority Queue中

# Priority Queue 版本 时间和空间复杂度

- 时间复杂度：O(nlog(k))
- 空间复杂度：O(k)

# Divide and Conquer 版本 解题思路

1. 拆分数组中的链表（即第一个节点，也是每个链表中的最小值），直至数组中的链表数 <= 2
2. 用mergeTwoLists方法合并两个链表
# Priority Queue 版本 时间和空间复杂度

- 时间复杂度：O(nlog(k))
- 空间复杂度：O(k)
