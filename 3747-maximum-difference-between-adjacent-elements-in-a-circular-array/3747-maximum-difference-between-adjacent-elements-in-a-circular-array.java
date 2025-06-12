class Solution {

    public int maxAdjacentDistance(int[] nums) {
        return getMaxDiff(nums);
    }

    public int getMaxDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] arr = new int[nums.length + 1];
        arr[arr.length - 1] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, Math.abs(arr[i] - arr[i - 1]));
        }
        return max;
    }
}
