package by.azapasnik.array.BestTimeToBuyAndSellStockII_122;

public class Solution {

    public int maxProfit(int[] prices) { // {7,1,5,3,6,4}
        int currentBuyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (0 < prices[i] - currentBuyPrice) {
                maxProfit += prices[i] - currentBuyPrice;
                currentBuyPrice = prices[i];
            } else if (currentBuyPrice > prices[i]) {
                currentBuyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}