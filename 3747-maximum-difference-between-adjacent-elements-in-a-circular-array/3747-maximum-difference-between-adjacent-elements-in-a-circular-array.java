class Solution {

    public int maxAdjacentDistance(int[] nums) {
        return getMaxAdjacentDistance(nums);
    }

    //approach 1 --using extra array
    //tc -> O(n) and sc -> O(n)
    public int getMaxAdjacentDistance(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        arr[arr.length - 1] = nums[0];
        int max = Integer.MIN_VALUE;
        int diff = 0;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.abs(arr[i] - arr[i - 1]);
            if (max < diff) {
                max = diff;
            }
        }
        return max;
    }
}
