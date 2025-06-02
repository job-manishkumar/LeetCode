class Solution {

    public int maximumProduct(int[] nums) {
        return getMaximumProduct(nums);
    }

    public int getMaximumProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondeMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                thirdMax = secondeMax;
                secondeMax = max;
                max = arr[i];
            } else if (secondeMax < arr[i]) {
                thirdMax = secondeMax;
                secondeMax = arr[i];
            } else if (thirdMax < arr[i]) {
                thirdMax = arr[i];
            }
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (secondMin > arr[i]) {
                secondMin = arr[i];
            }
        }
        long productMax1 = min * secondMin * max;
        long productMax2 = max * secondeMax * thirdMax;
        return (int)Math.max(productMax1,productMax2);
    }
}
