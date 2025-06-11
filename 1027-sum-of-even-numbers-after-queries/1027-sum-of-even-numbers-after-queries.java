class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        return getSumEvenAfterQueries(nums, queries);
    }

    public int[] getSumEvenAfterQueries(int[] arr, int[][] queries) {
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int value = queries[i][0];
            int index = queries[i][1];
            if (arr[index] % 2 == 0) {
                evenSum = evenSum - arr[index];
            }
            arr[index] = arr[index] + value;
            if (arr[index] % 2 == 0) {
                evenSum = evenSum + arr[index];
            }
            ans[i] = evenSum;
        }
        return ans;
    }
}
