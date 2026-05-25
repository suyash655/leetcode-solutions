/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp=node;
       ListNode curr=temp.next;
       temp.val=curr.val;
       temp.next=curr.next;
        
    }
}
