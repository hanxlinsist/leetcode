/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode sortedHead = new ListNode(0);
        ListNode curr = head;
        ListNode key = sortedHead;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            if (key.val > curr.val) key = sortedHead;
            while (key.next != null && key.next.val < curr.val) key = key.next;
            curr.next = key.next;
            key.next = curr;
            curr = next;
        }
        return sortedHead.next;
    }
}
