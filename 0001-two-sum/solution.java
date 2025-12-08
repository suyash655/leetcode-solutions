class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] values = new int[n];
        int[] indices = new int[n];
        
        // Create parallel arrays: values (sorted) + indices (original)
        for (int i = 0; i < n; i++) {
            values[i] = nums[i];
            indices[i] = i;
        }
        
        // Sort values while keeping indices together
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Integer.compare(values[a], values[b]));
        
        int i = 0, j = n - 1;
        while (i < j) {
            int sum = values[idx[i]] + values[idx[j]];
            if (sum == target) {
                return new int[] {indices[idx[i]], indices[idx[j]]};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {-1, -1};
    }
}

