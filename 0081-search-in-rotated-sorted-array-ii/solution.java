class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 1. Found the target
            if (nums[mid] == target) {
                return true;
            }

            // 2. Handle the duplicate elements (the unique part of Search II)
            // If the values at start, mid, and end are the same, we cannot determine 
            // the sorted side. Safely shrink the window.
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--; // Also decrementing end is often safer/more efficient
                continue;
            }
            
            // 3. Determine which side is sorted: Left half is sorted
            // (nums[start] <= nums[mid] implies the segment from start to mid is sorted)
            if (nums[start] <= nums[mid]) {
                // Check if target is within the boundaries of this sorted left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Target is on the left, move end
                } else {
                    start = mid + 1; // Target is on the right (unsorted part), move start
                }
            } 
            
            // 4. Right half must be sorted
            else { 
                // Check if target is within the boundaries of this sorted right half
                // Use target > nums[mid] to ensure it is strictly to the right of mid
                if (target > nums[mid] && target <= nums[end]) { 
                    start = mid + 1; // Target is on the right, move start
                } else {
                    end = mid - 1; // Target is on the left (unsorted part), move end
                }
            }
        }
        
        // Element not found
        return false;
    }
}
