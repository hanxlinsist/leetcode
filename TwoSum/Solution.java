public class Solution {
    public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
			map.put(nums[i], i);
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			int gap = target - nums[i];
			if ( map.get(gap) != null && map.get(gap) > i ) {
				result[0] = i + 1;
				result[1] = map.get(gap) + 1;
				break;
			}
		}
		
		return result;
	}
}
