public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new LinkedList<Integer>();
        for (int num : nums1)
            map.put(num, num);
        for (int num : nums2)
            if (map.get(num) != null) {
                list.add(num);
                map.remove(num);
            }
        int[] result = new int[list.size()];
        int i = 0;
        for (int num : list)
            result[i++] = num;
        return result;
    }
}
