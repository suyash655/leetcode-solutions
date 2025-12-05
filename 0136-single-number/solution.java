class Solution {
    public int singleNumber(int[] nums) {
         int n=nums.length;
         int m=0;
         for(int i=0;i<n;i++){
            m ^= nums[i];

         }
        return m;
        }
        
    }

