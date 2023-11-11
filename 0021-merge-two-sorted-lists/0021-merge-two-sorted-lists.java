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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        ListNode remp=list2;
        ListNode memp= new ListNode();
        ListNode ans= memp;
        while(temp!=null  || remp!=null){
             
             if(temp==null){
                 ans.next=remp;
                 
                 remp=remp.next;
             }else if( remp==null){
                 ans.next=temp;
                 
                 temp=temp.next;
             }else if(temp.val<=remp.val){
                 ans.next=temp;
                
                 temp=temp.next;
             }else{
                 ans.next=remp;
                
                 remp=remp.next;
             }
             ans=ans.next;
        }
        return memp.next;
    }
}