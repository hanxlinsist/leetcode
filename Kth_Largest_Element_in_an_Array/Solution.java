// Priority Queue 版本
public class Solution {
    public int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return num2 - num1; // construct max-heap
			}
		});
        for (int i : nums) pq.offer(i);
        while (k-- > 1) pq.poll();
        return pq.poll();
    }
}

// Quicksort 版本
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int lo = 0;
        int hi = nums.length - 1;
        while (true) {
            int kth = partition(nums, lo, hi);
            if (kth == k - 1) return nums[kth];
            if (kth > k -1) hi = kth - 1;
            else lo = kth + 1;
        }
    }
    
    public int partition(int[] nums, int lo, int hi) {
        int pivot = nums[hi];
        int leftmost = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (nums[j] > pivot) {
                leftmost++;
                swap(nums, j, leftmost);
            }
        }
        swap(nums, leftmost + 1, hi);
        
        return leftmost + 1;
    }
    
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
