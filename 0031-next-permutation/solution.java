class Solution {
    public static void swap(int[] arr,int a , int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    public static void reverse(int[] arr, int start){
        int s=start;
        int e=arr.length-1;
        while(s<=e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=-1;

        for(int i=n-2;i>=0;i--){
             if(nums[i]<nums[i+1]){
                k=i;
                break;
             }
        }
        if(k==-1){
            reverse(nums,0);
        }
        if(k!=-1){
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[k]){
                swap(nums,i,k);
                break;
            }
        }
        reverse(nums,k+1);
        }
    }
}
       
