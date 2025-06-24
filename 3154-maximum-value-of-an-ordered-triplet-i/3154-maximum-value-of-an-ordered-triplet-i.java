class Solution {

    public long maximumTripletValue(int[] nums) {
        return getMaximumTripletValue_2(nums);
    }

    //approach 1
    //tc -> O(n3) and sc -O(1)
    public long getMaximumTripletValue(int[] arr) {
        int i = 0;
        long max = 0;
        while (i < arr.length - 2) {
            int j = i + 1;
            while (j < arr.length - 1) {
                int k = j + 1;
                while (k < arr.length) {
                    max = Math.max(max, (long) (arr[i] - arr[j]) * arr[k]);
                    k++;
                }
                j++;
            }
            i++;
        }
        return max;
    }

    //approach 2
    public long getMaximumTripletValue_2(int[] arr) {
        
        long max = 0;
        for (int j = 1; j < arr.length - 1; j++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int i = j - 1; i >= 0; i--) {
                leftMax = Math.max(leftMax, arr[i]);
            }
            for(int k =j+1;k<arr.length;k++){
                rightMax = Math.max(rightMax, arr[k]);
            }
            max = Math.max(max,(long)(leftMax-arr[j])*rightMax);
        }
        return max;
    }
}
