/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return;
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        second = rev(second);
        slow.next = null;
        ListNode first = head;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next=second;
            second.next= temp1;
            first = temp1;
            second = temp2;
        }
    }
}
