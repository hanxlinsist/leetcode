# 题目链接

[Insertion Sort List](https://leetcode.com/problems/insertion-sort-list/)

# 解题思路

这里的思路和Insertion Sort基本一样。与数组相比，单链表不能找到当前节点的前一个节点，因此这里我用一个sortedHead变量去作为一个哨兵节点，引用整个排过序的列表。下面，我举个例子：

5 -> 3 -> 10 -> 6 -> 1 -> 89 -> 45 // 这是要排序的列表

下面是排序过程：

sortedHead(val = 0)
sortedHead(val = 0) -> 5
sortedHead(val = 0) -> 3 -> 5
sortedHead(val = 0) -> 3 -> 5 -> 10
sortedHead(val = 0) -> 3 -> 5 -> 6 -> 10
sortedHead(val = 0) -> 1 -> 3 -> 5 -> 6 -> 10
sortedHead(val = 0) -> 1 -> 3 -> 5 -> 6 -> 10 -> 45
sortedHead(val = 0) -> 1 -> 3 -> 5 -> 6 -> 10 -> 45 -> 89

最后返回：sortedHead.next

# 时间和空间复杂度

- 时间复杂度：O(n^2)
- 空间复杂度：O(1)
