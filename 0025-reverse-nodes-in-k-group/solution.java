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
    public static void reverse(int[] arr,int start1,int end1){
        int start=start1;
        int end=end1;
        

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }

        

        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k<=1){
            return head;
        }

        ListNode temp=head;
       
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }

        int nj=cnt/k;
        
        int[] arr=new int[cnt];
        
        int i=0;
        temp=head;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
            

        }
        
       
        for(int j=0;j<nj;j++){
            int start=j*k;
            int end=start+k-1;
            reverse(arr,start,end);
        }




        

        temp=head;
        int c=0;
        while(temp!=null){
            temp.val=arr[c++];
            temp=temp.next;
            
        }



    


    return head;
        
    }
}
