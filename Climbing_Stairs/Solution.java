// Top-Down with memoization
public class Solution {
    Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) return n;
        if (map.get(n) == null)
            map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return map.get(n);
    }
}

// bottom-up method
public class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) return n;
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i = 0; i < n - 2; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
