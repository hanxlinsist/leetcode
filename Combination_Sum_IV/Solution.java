// Top-Down with memoization
public class Solution {
    int[] memo;
    public int combinationSum4(int[] nums, int target) {
        memo = new int[target + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1; // 为了不用验证base case == 0的情况
        return helper(nums, target);
    }
    
    public int helper(int[] nums, int target) {
        if (memo[target] != -1) return memo[target];
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            if (target >= nums[i])
                res += helper(nums, target - nums[i]);
        memo[target] = res;
        return res;
    }
}

// bottom-up method
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        memo[0] = 1;
        for (int i = 1; i < memo.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (i - nums[j] >= 0)
                    memo[i] += memo[i - nums[j]];
        return memo[target];
    }
}
