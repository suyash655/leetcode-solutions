class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int n=nums.length;
        int j=0;
        int m=1;
        int l=0;
        if(nums.length==1){
            l=1;
        }
       
       
        for(int i=1;i<n;i++){
        if(nums[i]==nums[i-1]+1){
            m++;
        }else if(nums[i-1]==nums[i]){
            m=m;
        }else{
           m=1; 
        }
        if(m>l){
            l=m;
        }
        }
       return l; 
    }
}
