class Solution {

    public int findNumbers(int[] nums) {
        return getFindNumbers(nums);
    }

    //approach 1
    public int getFindNumbers(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (countDigit(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countDigit(int i) {
        int count = 0;
        while (i > 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
}
