class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        return getMaxConsecutiveOnes(nums);
    }

    public int getMaxConsecutiveOnes(int[] arr) {
        int length = 0;
        int maxLength = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 0;
            } 
        }
        maxLength = Math.max(maxLength, length);
        
        return maxLength;
    }
}
