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
        if(head.next==null && head.val==n){
            
            return null;
            
            
        }
        

        ListNode nodeindex=head;
        ListNode name=head;
        ListNode prev=head;
        int cnt=0;
        while(nodeindex!=null){
            
            nodeindex=nodeindex.next;
            cnt++;
            
        }
       
        int m=cnt-n;

        if(m==0) return head.next;

        
        

        int k=0;
        while(name!=null){

            if(k==m){
                prev.next=name.next;
                break;


            }else{
                
                prev=name;
                name=name.next;
                k++;
            
            }
        }
        return head;
        
    }
}
