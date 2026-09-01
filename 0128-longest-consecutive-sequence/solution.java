class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        int seq=1;
        int max=1;
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i-1]==(nums[i]-1)){
                seq+=1;
                max=Math.max(max,seq);

            }else{
                seq=1;
            }


        }
        return max;
    }
}
