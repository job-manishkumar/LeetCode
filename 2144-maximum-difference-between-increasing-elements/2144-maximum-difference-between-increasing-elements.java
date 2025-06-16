class Solution {

    public int maximumDifference(int[] nums) {
        return getMaxDiff(nums);
    }

    public int getMaxDiff(int[] arr) {
        int min = Integer.MAX_VALUE;
        int maxDiff = -1;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i - 1]);
            if (min != arr[i]) {
                maxDiff = Math.max(maxDiff, arr[i] - min);
            }
        }
        if (maxDiff < 0) {
            return -1;
        }
        return maxDiff;
    }
}
