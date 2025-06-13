class Solution {

    public String largestOddNumber(String num) {
        return getLargestOdd(num);
    }

    public String getLargestOdd(String str) {
        int lsb = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) % 2 != 0) {
                lsb = i;
                break;
            }
        }
        String s = str.substring(0, lsb+1);
        return s;
    }
}
