package com.xinlinqi.leetcode;

public class BestTimeToBuyAndSellStockIII {
	public int maxProfit(int[] prices) {
		if(prices.length <= 0)	return 0;
		
		int profit = 0;
		
		for(int i=0; i < prices.length; i++){
			profit = Math.max(cal(prices, 0, i) + cal(prices, i+1, prices.length-1), profit);
		}
		
		return profit;
    }
	
	private int cal(int[] prices, int start, int end){
		if(start > end)	return 0;
		int res = 0, min = prices[start];
		for(int i=start; i <= end; i++){
			min = Math.min(min, prices[i]);
			res = Math.max(res, prices[i]-min);
		}
		
		return res;
	}
	
	public static void main(String[] args){
		BestTimeToBuyAndSellStockIII iii = new BestTimeToBuyAndSellStockIII();
		int prices[] = {2, 1};
		
		System.out.println(iii.maxProfit(prices));
	}
}
