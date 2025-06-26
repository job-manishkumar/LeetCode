class Solution {

    public int maximumDifference(int[] nums) {
        return getMaximumDifference(nums);
    }

    //approach 1 --
    public int getMaximumDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    max = Math.max(max, arr[j] - arr[i]);
                }
            }
        }
        return max;
    }
}
