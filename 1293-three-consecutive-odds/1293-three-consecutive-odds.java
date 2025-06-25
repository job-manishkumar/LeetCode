class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        return getThreeConsecutiveOdds(arr);
    }

    //approach 1
    public boolean getThreeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    //approach 2 - using sliding window
    public boolean getThreeConsecutiveOdds_2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i];
        }
        if (sum % 2 != 0) {
            return true;
        }
        int si = 1;
        int ei = 3;
        while (ei < arr.length) {
            sum = sum + arr[ei] - arr[si - 1];
            if (sum % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
