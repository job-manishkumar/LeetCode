class Solution {

    public int maximumProduct(int[] nums) {
        return maxProduct(nums);
    }

    public int maxProduct(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if (secondMax < i) {
                thirdMax = secondMax;
                secondMax = i;
            }
            else if(thirdMax< i){
                thirdMax = i;
            }
            if (min > i) {
                secondMin = min;
                min = i;
            } 
            else if(secondMin > i){
                    secondMin = i;
            }
        }

        long getProdcutWithMin = min*secondMin*max;
        long getProdcutWithMax = max*secondMax*thirdMax;
        return (int)Math.max(getProdcutWithMin,getProdcutWithMax);
    }
}
