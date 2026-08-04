class Solution {
    public int maxProfit(int[] prices) {
        int l=prices[0];
        int profit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<l){
                l=prices[i];
            }
            profit=Math.max(profit,prices[i]-l);


        }
        return profit;
        

    }
}
