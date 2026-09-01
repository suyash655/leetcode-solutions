class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0, ed = numbers.length - 1;
        while (st < ed) {
            int sum = numbers[st] + numbers[ed];
            if (sum == target) {
                return new int[]{st + 1, ed + 1};
            } else if (sum < target) {
                st++;
            } else {
                ed--;
            }
        }
        return new int[]{-1, -1};
    }
}   
