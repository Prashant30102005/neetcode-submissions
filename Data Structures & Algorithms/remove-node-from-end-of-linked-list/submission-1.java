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
        ListNode temp2 = new ListNode(0,head);
        ListNode temp = temp2;
        for(int i = 0;i<=n;i++){
            temp = temp.next;
        }
        ListNode slow = temp2;
        while(temp!=null){
            temp=temp.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return temp2.next;
    }
}
