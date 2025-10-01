class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1=new int[n];
        int[] arr2=new int[nums.length-n];
        int[] arr=new int[nums.length];
          
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];

        }
        for(int i=0;i<nums.length-n;i++ ){
            arr2[i]=nums[i+n];
        }
        int k=0,l=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=arr1[k++];
            }
            else{
                arr[i]=arr2[l++];
            }
        }
        


    return arr;
        
    }
}




