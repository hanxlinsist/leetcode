public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
        Map<Long,Long> map = new HashMap<Long, Long>();
        
        for (int i = 0; i < nums.length; i++) {
            long bucket = ((long)nums[i]) / ((long)t + 1);
            if ( map.containsKey(bucket) && Math.abs(map.get(bucket) - nums[i]) <= t )
                return true;
            if ( map.containsKey(bucket - 1) && Math.abs(map.get(bucket - 1) - nums[i]) <= t )
                return true;
            if ( map.containsKey(bucket + 1) && Math.abs(map.get(bucket + 1) - nums[i]) <= t )
                return true;


            if (map.entrySet().size() >= k)
                map.remove(((long)nums[i - k]) / ((long)t + 1)); // 因为索引i和j至多不能超过k，所以把索引i-k的bucket删除掉
            map.put(bucket, (long)nums[i]);
        }
        
        return false;
    }
}
