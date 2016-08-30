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
    public List<Interval> merge(List<Interval> intervals) {
    	if (intervals.size() <= 1) return intervals;
    	
    	Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval num1, Interval num2) {
				return num1.start - num2.start;
			}
		});
    	
    	List<Interval> result = new LinkedList<Interval>();
    	int start = intervals.get(0).start;
    	int end = intervals.get(0).end;
    	
    	for (Interval interval : intervals) {
		if (interval.start <= end) // 重叠
			end = Math.max(end, interval.end);
		else {
			result.add(new Interval(start, end));
			start = interval.start;
			end = interval.end;
		}
	}
    	
    	result.add(new Interval(start, end));
    	
	return result;
    }
}
