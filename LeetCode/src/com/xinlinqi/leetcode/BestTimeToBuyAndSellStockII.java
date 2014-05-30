package com.xinlinqi.leetcode;

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		
		if(prices.length <= 1)	return 0;
		int profit = 0;
		for(int i=0; i < prices.length;){
			int buy = prices[i], sell = prices[i++];
			while(i < prices.length && buy > prices[i]){
				buy = prices[i++];
				sell = buy;
			}
			while(i < prices.length && sell < prices[i]){
				sell = prices[i++];
			}
			profit += sell - buy;
		}
		return profit;
    }
	
	public static void main(String[] args){
		BestTimeToBuyAndSellStockII bss = new BestTimeToBuyAndSellStockII();
		int[] prices = {2, 1};
		System.out.println(bss.maxProfit(prices));
	}
	
}
