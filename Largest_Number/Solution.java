public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            s[i] = String.valueOf(nums[i]);
        
	Comparator<String> comp = new Comparator<String>() {
		@Override
		public int compare(String str1, String str2) {
			String s1 = str1 + str2;
			String s2 = str2 + str1;
			return s2.compareTo(s1); // reverse order here, so we can do append() later
		}
	};
        
        Arrays.sort(s, comp);
        
        // An extreme edge case by leetcode, say you have only a bunch of 0 in your int array
        if(s[0].charAt(0) == '0')
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String str : s)
            sb.append(str);
            
        return sb.toString();
    }
}
