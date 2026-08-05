class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int sp=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }else if(prices[i]>bp){
                profit+=prices[i]-bp;
                bp=prices[i];

            }



        }
        return profit;
        
        
    }
}
