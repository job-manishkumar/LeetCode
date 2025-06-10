class Solution {

    public int maxProductDifference(int[] nums) {
        return getMaxProdDiff(nums);
    }

    public int getMaxProdDiff(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : arr) {
            if (max < i) {
                secondMax = max;
                max = i;
            } else if (secondMax < i) {
                secondMax = i;
            }
            if (min > i) {
                secondMin = min;
                min = i;
            } else if (secondMin > i) {
                secondMin = i;
            }
        }

        int prod1 = max * secondMax;
        int prod2 = min * secondMin;
        return prod1 - prod2;
    }
}
