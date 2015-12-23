/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(-1); //头节点
        ListNode currNode = head;
        
        while(l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int temp = a + b + carry;
            int value = temp % 10;
            carry = temp / 10;
            currNode.next = new ListNode(value);
            
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            currNode = currNode.next;
        }
        
        if (carry > 0)
            currNode.next = new ListNode(carry);
            
        return head.next;
    }
}
