public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>(nums2.length);
        for (int i : nums1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] retVal = new int[list.size()];
        for (int i = 0; i < retVal.length; i++) retVal[i] = list.get(i);
        return retVal;
    }
}
