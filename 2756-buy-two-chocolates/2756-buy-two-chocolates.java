class Solution {

    public int buyChoco(int[] prices, int money) {
        return buyChocolates(prices, money);
    }

    //approach 1 - - using sorting
    //tc -> O(nlogn) and sc -> O(1)
    public int buyChocolates(int[] arr, int money) {
        Arrays.sort(arr);
        int sum = arr[0] + arr[1];
        return sum > money ? money : money - sum;
    }
}
