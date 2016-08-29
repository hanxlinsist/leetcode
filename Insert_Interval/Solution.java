/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int i = 0;
        int start = newInterval.start; // 当intervals的大小为0时，可以直接执行第25行代码
        int end = newInterval.end; // 当intervals的大小为0时，可以直接执行第25行代码
        while (i < intervals.size() && newInterval.start > intervals.get(i).end) i++;
        if (i < intervals.size()) start = Math.min(newInterval.start, intervals.get(i).start);
        else { // 如果 i == intervals.size()，那么直接把newInterval加入到列表最后
            intervals.add(newInterval);
            return intervals;
        }
        while (i < intervals.size() && newInterval.end >= intervals.get(i).start) {
            end = Math.max(newInterval.end, intervals.get(i).end);
            intervals.remove(i);
        }
        intervals.add(i, new Interval(start, end));
        return intervals;
    }
}
