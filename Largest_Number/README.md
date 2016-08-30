# 题目链接

[Reverse String](https://leetcode.com/problems/largest-number/)

# 解题思路

例如：

String s1 = "9";
String s2 = "31";

String case1 =  s1 + s2; // 931
String case2 = s2 + s1; // 319

931 > 319 因此，我把s1放在s2的前面，我们可以利用这个性质写一个比较器，然后用Arrays.sort排序。

Arrays.sort用的是merge sort，因此时间复杂度为O(nlgn)

# 时间和空间复杂度

- 时间复杂度：O(nlgn)
- 空间复杂度：O(n)
