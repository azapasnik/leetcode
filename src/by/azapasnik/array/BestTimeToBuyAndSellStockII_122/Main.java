package by.azapasnik.array.BestTimeToBuyAndSellStockII_122;

public class Main {

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4}; //7
//        int[] prices = {1,2,3,4,5}; //4
        int[] prices = {7,6,4,3,1}; //0

        int sum = new Solution().maxProfit(prices);

        System.out.println(sum);
    }

}
