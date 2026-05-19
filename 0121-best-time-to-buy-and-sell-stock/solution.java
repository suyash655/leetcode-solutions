class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minBuy = prices[0]; // Track the lowest price seen so far
        int maxProfit = 0;      // Track the maximum profit
        
        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if sold today
            int currentProfit = prices[i] - minBuy;
            
            // Update max profit if current profit is higher
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            
            // Update min buy price if today's price is lower
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        
        return maxProfit;
    }
}   
