class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n; // Handle cases where k > n
        int[] temp = new int[n];

        // 1. Place each element at its new shifted position in temp
        for (int i = 0; i < n; i++) {
            temp[(i + d) % n] = nums[i];
        }

        // 2. Copy temp back to the original nums array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
