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
    public static void mergesort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid =start+(end-start)/2;
        if(start<=end){
        
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    public static void merge(int[] arr,int s,int mid,int e){
        int[] temp=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int l=0;
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[l]=arr[i];
                
                i++;
            }else{
                temp[l]=arr[j];
                
                j++;
            }
        l++;
        }
        while(i<=mid){
            temp[l]=arr[i];
            i++;
            l++;

        }
        while(j<=e){
            temp[l]=arr[j];
            j++;
            l++;
        }

        for(int ilp=0;ilp<temp.length;ilp++){
            arr[s+ilp]=temp[ilp];
        }
    }
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
    
        int[] arr=new int[cnt];

        int start=0;
        int end=arr.length-1;
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }

        mergesort(arr,start,end);



        temp=head;
        int c=0;
        while(temp!=null){
            temp.val=arr[c];
            temp=temp.next;
            c++;

        }
        return head;
        
    }
}
