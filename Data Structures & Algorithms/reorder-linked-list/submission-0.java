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
    public static int leng(ListNode head){
        int i = 0;
        ListNode temp = head;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        return i;
    }
    public static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode temp;
        while(current!=null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        int length = leng(head);
        ListNode middle = head;
        for(int i = 0;i<(length-1)/2;i++){
            middle = middle.next;
        }
        ListNode second = middle.next;
        middle.next = null;
        second = rev(second);
        ListNode first = head;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
        
    }
}
