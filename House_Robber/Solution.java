// 这个版本会出现 Time Limit Exceeded 错误
public class Solution {
    public int rob(int[] nums) {
        return robBeforeIth(nums, nums.length - 1);
    }
    
    // 求出前hi家House我今晚能偷到的最大值
    public int robBeforeIth(int[] nums, int hi) {
        if (hi < 0) return 0;
        if (hi == 0) return nums[hi];
        if (hi == 1) return Math.max(nums[hi], nums[hi - 1]);
        return Math.max(robBeforeIth(nums, hi - 2) + nums[hi], robBeforeIth(nums, hi - 1));
    }
}

// 带备忘的自顶向下法（Top-Down with memoization）
public class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public int rob(int[] nums) {
        return robBeforeIth(nums, nums.length - 1);
    }
    
    public int robBeforeIth(int[] nums, int hi) {
        if (hi < 0) return 0;
        if (hi == 0) return nums[hi];
        if (hi == 1) return Math.max(nums[hi], nums[hi - 1]);
        if (map.get(hi) != null) return map.get(hi);
        int maxVal = Math.max(robBeforeIth(nums, hi - 2) + nums[hi], robBeforeIth(nums, hi - 1));
        map.put(hi, maxVal);
        return maxVal;
    }
}

// 自底向上法（bottom-up method）
public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[len - 1];
        if (len == 2) return Math.max(nums[len - 1], nums[len - 2]);
        
        int[] maxMoney = new int[len];
        maxMoney[0] = nums[0];
        maxMoney[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++)
            maxMoney[i] = Math.max(maxMoney[i - 2] + nums[i], maxMoney[i - 1]);
        return maxMoney[len - 1];
    }
}
