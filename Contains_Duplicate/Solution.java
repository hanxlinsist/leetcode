public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num))
                return true;
            map.put(num, num);
        }
        return false;
    }
}
