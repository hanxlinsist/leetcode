# 题目链接

[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

# 解题思路

由于num1由足够的大小容纳两个数组的元素，因此我们用一个指针指向nums1的最后一个元素，用一个指针指向nums2的最后一个元素，用一个指针指向合并后的最后一个元素。

如果 i >= 0，就意味着nums2已经完全合并到nums1中，因此不需要任何操作。如果j >= 0, 意味着nums2还没有完全合并到nums1中，我们只要把剩下的元素依次放入就行了。因此第[14行](https://github.com/hanxlinsist/leetcode/blob/master/Merge_Sorted_Array/Solution.java#L14)代码只有j >= 0

# 时间和空间复杂度

时间复杂度：O(n)
空间复杂度：O(n)
