class Solution {

    public long maximumTripletValue(int[] nums) {
        return getMaximumTripletValue(nums);
    }

    public long getMaximumTripletValue(int[] arr) {
        int i = 0;
        long max = 0;
        while (i < arr.length - 2) {
            int j = i + 1;
            while (j < arr.length - 1) {
                int k = j + 1;
                while (k < arr.length) {
                    max = Math.max(max, (long)(arr[i] - arr[j]) * arr[k]);
                    k++;
                }
                j++;
            }
            i++;
        }
        return max;
    }
}
