class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> seen=new HashSet<>();
       int left=0;
       
       int sum=0;
       int maxsum=0;
       for( int right=0;right<nums.length;right++){
        while(seen.contains(nums[right])){
            seen.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
        seen.add(nums[right]);
        sum+=nums[right];

        maxsum=Math.max(maxsum,sum);
       }
       return maxsum;

    }
}
