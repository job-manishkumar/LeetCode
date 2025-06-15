class Solution {

    public int[][] divideArray(int[] nums, int k) {
        return divideArrayIntoParts(nums, k);
    }

    public int[][] divideArrayIntoParts(int[] arr, int k) {
        int[][] ans = new int[arr.length / 3][3];
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i <= arr.length - 3; i = i + 3) {
            if (((arr[i + 1] - arr[i]) <= k) && ((arr[i + 2] - arr[i + 1]) <= k) && ((arr[i + 2] - arr[i]) <= k)) {
                ans[index] = new int[] { arr[i], arr[i + 1], arr[i + 2] };
                index++;
            }
        }
        if (index == ans.length) {
            return ans;
        }
        return new int[][]{};
    }
}
