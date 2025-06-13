class Solution {

    public int buyChoco(int[] prices, int money) {
        return buyChocolates_2(prices, money);
    }

    //approach 1 - - using sorting
    //tc -> O(nlogn) and sc -> O(1)
    public int buyChocolates(int[] arr, int money) {
        Arrays.sort(arr);
        int sum = arr[0] + arr[1];
        return sum > money ? money : money - sum;
    }

    //approach 2 -- using min and secon min
    public int buyChocolates_2(int[] arr, int money) {
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
        return sum>money?money:money-sum;
    }
}
