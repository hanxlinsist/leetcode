# 题目链接

[Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/)

# 解题思路

1. 查看是否有进位（只有两个对应的位都是1才会产生进位）， 因此用carry = a & b
2. 由于我们已经保存进位到carry变量，现在我们正常相加就行，用a = a ^ b
3. 如果进位项存在，把它左移一位赋值给b，
4. 重复1~3过程

# 时间和空间复杂度

时间复杂度：O(1)
空间复杂度：O(1)

# 参考资料

[Two's Complement](https://www.cs.cornell.edu/~tomf/notes/cps104/twoscomp.html)
