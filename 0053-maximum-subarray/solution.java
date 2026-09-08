public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize with the first element to handle all-negative arrays correctly
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start a new one at current element
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            
            // Update the global maximum if the current subarray sum is larger
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}   
