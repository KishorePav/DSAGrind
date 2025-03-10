package SlidingWindow;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;

    }
}

// Leetcode question link:
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
