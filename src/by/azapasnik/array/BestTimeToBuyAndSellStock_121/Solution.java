package by.azapasnik.array.BestTimeToBuyAndSellStock_121;

public class Solution {

    public int maxProfit(int[] prices) { // {4,3,2,8,1}
        int currentBuyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (maxProfit < prices[i] - currentBuyPrice) {
                maxProfit = prices[i] - currentBuyPrice;
            }
            if (currentBuyPrice > prices[i]) {
                currentBuyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}