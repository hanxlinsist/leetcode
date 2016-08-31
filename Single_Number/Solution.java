public class Solution {
    public int singleNumber(int[] nums) {
        int retVal = 0;
        for (int num : nums)
            retVal ^= num;
        return retVal;
    }
}
