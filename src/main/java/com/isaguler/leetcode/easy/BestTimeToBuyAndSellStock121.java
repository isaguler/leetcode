package com.isaguler.leetcode.easy;

// Input: prices = [7,1,5,3,6,4]
// Input: prices = [7,6,4,3,1]

@SuppressWarnings("unused")
public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i=1; i< prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            if (prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }

        return profit;
    }
}
