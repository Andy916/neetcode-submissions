class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        
        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            right++;
        }
        
        return maxProfit;
    }
}