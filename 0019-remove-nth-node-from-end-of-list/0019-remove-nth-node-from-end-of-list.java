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

        ListNode temp= head;
        int count =0;

        while(temp != null){
             count++;
             temp=temp.next;
        }
        if(count==1){
            return null;
        }else if( count== n){
            return head.next;
        }
        
        int del= count-n;
       ListNode kemp= head;
        temp=kemp;
        while(del>1){
            temp= temp.next;
            del--;
        }
        temp.next= temp.next.next;
        return kemp;

        
    }
}