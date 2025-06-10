class Solution {

    public int buyChoco(int[] prices, int money) {
        return buyChocolates(prices, money);
    }

    public int buyChocolates(int[] arr, int money) {
        int min = Integer.MAX_VALUE;
        int seconMin = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i) {
                seconMin = min;
                min = i;
            } else if (seconMin > i) {
                seconMin = i;
            }
        }
        int sum = min+seconMin;
        if(sum>money){
            return money;
        }
        return money-sum;
    }
}
