class Solution {

    public int[] sortedSquares(int[] nums) {
        return getSquares(nums);
    }

    public int[] getSquares(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i : arr) {
            ans[index] = i * i;
            index++;
        }

        Arrays.sort(ans);
        return ans;
    }
}
