class Solution {

    public int maxAdjacentDistance(int[] nums) {
        return getMaxDiff(nums);
    }

    public int getMaxDiff(int[] arr) {
        int max = Math.abs(arr[0]-arr[arr.length-1]);
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, Math.abs(arr[i] - arr[i - 1]));
        }
        return max;
    }
}
