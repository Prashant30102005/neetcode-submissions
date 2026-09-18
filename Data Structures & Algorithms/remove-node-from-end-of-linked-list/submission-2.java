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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lis = new ListNode(-1);
        lis.next = head;
        ListNode dummy = lis;
        ListNode fast = lis;
        for(int i = 0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return lis.next;
    }
}
