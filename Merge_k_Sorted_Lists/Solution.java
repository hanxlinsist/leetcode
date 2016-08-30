/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
// Priority Queue 版本
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 1) return lists[0];
        
    	PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode node1, ListNode node2) {
				return node1.val - node2.val;
			}
		});
		
		for (ListNode head : lists)
		    if (head != null)
		        pq.offer(head);
		
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (!pq.isEmpty()) {
		    tail.next = pq.poll();
		    tail = tail.next;
		    
		    if (tail.next != null)
		        pq.offer(tail.next);
		}
		
		return dummy.next;
    }
}

// Divide and Conquer 版本
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return mergeTwoLists(lists[0], lists[1]);
        
        ListNode[] left = Arrays.copyOfRange(lists, 0, lists.length / 2);
        ListNode[] right = Arrays.copyOfRange(lists, lists.length / 2, lists.length);
        
        return mergeTwoLists(mergeKLists(left), mergeKLists(right));
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;            
        }
    }
}
