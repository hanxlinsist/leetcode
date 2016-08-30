# 题目链接

[Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

# Priority Queue 版本 解题思路

1. 用给定的数组构建max-heap  表面上插入一个元素需要O(log(n))的时间，总共有n个元素，因此时间为O(nlog(n)). 但是，我们可以求出一个更加准确的边界为O(n), 参见算法导论**第二部分**
2. 抽取k次就是kth大的数   抽取一次的时间为O(log(n))

# 时间和空间复杂度

- 时间复杂度：O(nklog(n))
- 空间复杂度：O(n)

# Quicksort 版本 解题思路

这个版本的思路类似于Quick sort.

1. 利用partition方法得到一个位置pos
2. 依据pos与kth的大小关系，把规模大小为T(n)的原问题化简为规模为T(n/2)的问题。

详情参见：[4 C++ Solutions using Partition, Max-Heap, priority_queue and multiset respectively](https://discuss.leetcode.com/topic/15256/4-c-solutions-using-partition-max-heap-priority_queue-and-multiset-respectively)

# 时间和空间复杂度

- 时间复杂度：O(n)
- 空间复杂度：O(1)
