public class Solution {
	public int lengthOfLongestSubstring(String s) {
		char[] cs = s.toCharArray();
		int start = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int maxLength = 0;
		for (int i = 0; i < cs.length; i++) {
			if (map.get(cs[i]) != null && map.get(cs[i]) >= start) {
				maxLength = Math.max(maxLength, i - start);
				start = map.get(cs[i]) + 1;
			}
			map.put(cs[i], i);
		}
		
		return Math.max(maxLength, cs.length - start);
	}
}
