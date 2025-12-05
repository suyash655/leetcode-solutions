class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                n++;
                m=Math.max(m,n);


            }else{
                n=0;
            }
            
           }
        return m;
        }
    }   
        
