class Solution {

    public int maxProfit(int[] prices) {
        return getMaxprofit(prices);
    }

    public int getMaxprofit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            profit = Math.max(profit, arr[i] - min);
        }
        return profit;
    }
}
