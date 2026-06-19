class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If it's 9, set to 0 and continue (carry over)
            digits[i] = 0;
        }
        
        // If we reach here, all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        // The rest are already 0 by default
        
        return result;
    }
}
