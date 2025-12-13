class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m=0;
        int h=0;
        int j=0;
        int f=0;
        int n=nums.length;
        int[] arr=new int[n/2];
        int[] arr1=new int[n/2];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[m]=nums[i];
                m++;
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr1[h]=nums[i];
                h++;
            }
        }
        for(int i=0;i<n;i=i+2){
           nums[i]=arr[j];
           nums[i+1]=arr1[j];
           j++;
        }

        

        return nums;
    }
}
