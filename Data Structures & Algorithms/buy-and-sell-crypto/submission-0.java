class Solution {
    public int maxProfit(int[] prices) 
    {
        //2 pointers
        int buy = 0; // lowerst price
        int maxProfit = 0;
        int n = prices.length;

       for(int sell = 1; sell < n; sell++)
        {
           
            if( prices[sell]>prices[buy]) 
            {
                int currProfit = prices[sell]-prices[buy];
                maxProfit = Math.max(maxProfit,currProfit);
            }
            else{
                buy = sell;
            }

        }
        return maxProfit;

        
    }
}

