class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        
        int maxReach = 0;
        int steps = 0;
        int end = 0;
        
        // Iterate up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest index reachable from current position
            maxReach = Math.max(maxReach, i + nums[i]);
            
            // If we've reached the end of the current jump's range
            if (i == end) {
                end = maxReach;
                steps++;
            }
        }
        
        return steps;
    }
}   
