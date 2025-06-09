class Solution {

    public String largestOddNumber(String num) {
        return getLargestOddNumber(num);
    }

    public String getLargestOddNumber(String num) {
        int index = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
