class Solution {

    public int countSubarrays(int[] nums) {
        return getCountSubarrays(nums, 3);
    }

    public int getCountSubarrays(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        if (2 * sum == (3 * arr[(k - 1 + 0) / 2])) {
            count++;
        }
        int si = 1;
        int e = k;
        while (e < arr.length) {
            sum = sum + arr[e] - arr[si - 1];
            if (2 * sum == (3 * arr[(e + si) / 2])) {
                count++;
            }
            e++;
            si++;
        }
        return count;
    }
}
