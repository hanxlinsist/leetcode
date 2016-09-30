# 题目链接

[Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

# 解题思路

假设我们的链表为A -> B -> C -> D -> E -> F -> G

如果我们想删除节点D。我们只需要把E的值赋值给D，之后把D的next指针指向F。

# 时间和空间复杂度

- 时间复杂度：O(1)
- 空间复杂度：O(1)
