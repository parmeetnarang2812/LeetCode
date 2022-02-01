/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), 
 * Design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 * 
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * 
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * 
 * Example 2:
 * Input: [7,6,4,3,1]
 * Output: 0
 * 
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */



/*
  The logic to solve this problem is same as "max subarray problem" using Kadane's Algorithm.
  All the straight forward solution should work, 
  but if the interviewer twists the question slightly by giving the difference array of prices, Ex: for {1, 7, 4, 11}, if he gives {0, 6, -3, 7}, it might be a little confusing.
  Here, the logic is to calculate the difference (maxProfit = prices[i] - prices[i-1]) of the original array, 
  and find a contiguous subarray giving maximum profit. If the difference falls below 0, reset it to zero.
*/


/*  leetcode solution
  class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int price : prices) {
            if(price < minPrice){
                minPrice = price;
            }  
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }
}
*/