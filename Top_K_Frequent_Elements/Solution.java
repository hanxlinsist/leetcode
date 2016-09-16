public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(nums.length, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
				return e2.getValue() - e1.getValue(); // contruct max-heap O(n)
			}
		});
		pq.addAll(map.entrySet());
		List<Integer> list = new LinkedList<Integer>();
		while (k-- > 0)
		    list.add(pq.poll().getKey()); // O(klog(n))
		return list;
    }
}
