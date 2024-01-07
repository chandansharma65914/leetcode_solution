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
    public ListNode reverseList(ListNode head) {
        ListNode temp= head;
       
        ListNode kemp= null;
           while(temp!=null){
               ListNode memp=temp.next;
               temp.next=kemp;
               kemp=temp;

               temp=memp;
           
             
           }
           return kemp;
    }
}