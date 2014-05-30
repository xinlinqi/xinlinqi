package com.xinlinqi.leetcode;

public class BestTimeToBuyAndSellStockI {
	public int maxProfit(int[] prices) {
		
		int min = prices[0], profit = 0;
		
		for(int i=0; i < prices.length; i++){
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i]-min);
		}
		
		return profit;
    }
}
