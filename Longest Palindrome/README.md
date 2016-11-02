# 题目链接

[Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)

# 解题思路

主要就是统计字符串中每个字符出现的次数，保存奇数次数的字符的个数。这是因为偶数次数的字符是一定可以构造出回文的，奇数次数的字符需要减去1才能去构造回文。

# 时间和空间复杂度

- 时间复杂度：O(s.length())
- 空间复杂度：O(s.length())
