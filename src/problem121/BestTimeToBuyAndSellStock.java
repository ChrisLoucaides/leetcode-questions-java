package problem121;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            if (currentPrice < lowest) {
                lowest = currentPrice;
            } else if (currentPrice - lowest > maxProfit) {
                maxProfit = currentPrice - lowest;
            }
        }
        return maxProfit;
    }

}
