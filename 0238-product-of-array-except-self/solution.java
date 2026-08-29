class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans=new int[nums.length];
        int product=1;
        int zerocount=0;        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zerocount++;
           else product=product*nums[i];
            }

        
        for(int i=0;i<nums.length;i++){
             if(zerocount>1){
                ans[i]=0;
             }else if(zerocount==1){
                ans[i]=(nums[i]==0) ? product:0;
            }else if(zerocount==0){
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}
