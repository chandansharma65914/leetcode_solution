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
        ListNode curr= head , prev=null , fut=null;

        while(curr !=null){
            fut= curr.next;
            curr.next= prev;
              prev = curr;
              curr= fut;
        }
        return prev;
        
    }
}