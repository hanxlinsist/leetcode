public class Solution {
    public int longestPalindrome(String s) {
        Map<Character,  Integer> map = new HashMap<Character,  Integer>();
        int odds = 0;
        for (int i = 0; i < s.length(); i++) {
            int charCount = map.getOrDefault(s.charAt(i), 0);
            int newVal = ++charCount;
            if (newVal % 2 != 0) odds++;
            else odds--;
            map.put(s.charAt(i), newVal);
        }
        return s.length() - odds + (odds > 0 ? 1 : 0);
    }
}
