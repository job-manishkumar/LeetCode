class Solution {

    public int maxProduct(int[] nums) {
        return getMaxProduct(nums);
    }

    public int getMaxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i]) {
                secondMax = arr[i];
            }
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (secondMin > arr[i]) {
                secondMin = arr[i];
            }
        }
        // System.out.println(max+" : "+secondMax+" : "+min+" : "+ secondMin);
        int multi1 = (min - 1) * (secondMin - 1);
        int multi2 = (max - 1) * (secondMax - 1);
        if(multi1>multi2){
            return multi1;
        }
        return multi2;
    }
}
