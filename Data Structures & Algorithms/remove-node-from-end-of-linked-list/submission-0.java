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
    public static int length(ListNode head,int n){
        int i = 0;
        ListNode temp = head;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        return i;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int pos = length(head,n);
        int i = 0;
        ListNode temp = head;
        if(pos == n )return head.next;
        pos= pos-n;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        
        temp.next = temp.next.next;
        return head;
    }
}
