package by.azapasnik.array.BestTimeToBuyAndSellStock_121;

public class Main {

    public static void main(String[] args) {
//        int[] prices = {4,3,2,8,1};
//      int[] prices = {7, 1, 5, 3, 6, 4}; //5
        int[] prices = {5,2,9,1,4}; //7

        int sum = new Solution().maxProfit(prices);

        System.out.println(sum);
    }

}
