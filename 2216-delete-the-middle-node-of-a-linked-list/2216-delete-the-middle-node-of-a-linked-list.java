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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow= head, fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){
            slow.val= slow.next.val;
            slow.next=slow.next.next;
        }else{
           slow.next= slow.next.next;
        }
        return head;
    }
}