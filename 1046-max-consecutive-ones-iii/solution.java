class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int l=0;
        int zeroes=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeroes++;

            }
            if(zeroes<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }else{
               if(nums[l]==0) zeroes--;
               l++;
            }

        }
        return maxlen;

        
    }
}
