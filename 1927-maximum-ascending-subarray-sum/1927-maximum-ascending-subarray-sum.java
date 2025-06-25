class Solution {

    public int maxAscendingSum(int[] nums) {
        return getMaxAscendingSum(nums);
    }

    //approach
    //tc -> O(n) and sc -> O(1)
    public int getMaxAscendingSum(int[] arr) {
        int sum = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
