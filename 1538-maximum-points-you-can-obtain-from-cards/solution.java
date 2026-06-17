class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentSum = 0;
        
        // 1. Initialize sum with the last k cards (all from the right)
        for (int i = n - k; i < n; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxScore = currentSum;
        
        // 2. Slide the window: 
        // Add card from left (i), remove card from right (n - k + i)
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i] - cardPoints[n - k + i];
            maxScore = Math.max(maxScore, currentSum);
        }
        
        return maxScore;
    }
}   
