class Solution {

    public int findNumbers(int[] nums) {
        return getFindNumbers_2(nums);
    }

    //approach 1
    //tc -> O(n*d) and sc -> O(1)
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

    //approach 2 - using static range
    public int getFindNumbers_2(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if ((i >= 10 && i <= 99) || (i >= 1000 && i <= 9999) || (i == 100000)) {
                count++;
            }
        }
        return count;
    }
}
