public class Solution {
    public String reverseString(String s) {
       char[] word = s.toCharArray();
       int low = 0;
       int high = s.length() - 1;
       while ( low < high ) {
           char temp = word[low];
           word[low] = word[high];
           word[high] = temp;
           low++;
           high--;
       }
       
       return new String(word);
    }
}
