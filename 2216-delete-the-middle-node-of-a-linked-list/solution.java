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
        if(head==null || head.next==null){
            return null; 
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode k=head;
        ListNode m=head;
        ListNode l=head;
        int cnt =0;

        while(l.next!=null){
            l=l.next;
            cnt++;
        }
        if(cnt==1){
            head.next=null;
            return head;
        }
        



        while(fast.next!=null && fast.next.next!=null && cnt!=1){
            k=slow;
            
            
            slow=slow.next;
            fast=fast.next;
            fast=fast.next;
            m=slow.next;

        }

        
        if(cnt%2!=0 && cnt!=1){
            k=k.next;
            m=m.next;
            k.next=m;
        }else{
            k.next=m;
        }

        return head;
    }
}
