# 题目链接

[Contains Duplicate III](https://leetcode.com/problems/contains-duplicate-iii/)

# 解题思路

1. 因为要求nums[i]和nums[j]的差值至多不能超过t，因此把不超过t的相邻值映射到同一个bucket或bucket-1或bucket+1
2. 因为索引i和j至多不能超过k，所以把索引i-k的bucket删除掉。

**注意：用long是因为leetcode中极端的test case会使我们的程序超出Integer范围**

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(k)
