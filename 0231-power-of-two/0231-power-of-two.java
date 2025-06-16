class Solution {

    public boolean isPowerOfTwo(int n) {
        return getNumberOfPowerTwo_2(n);
    }

    //approach 1
    //tc -> O(logn) and sc - > O(logn)
    public boolean getNumberOfPowerTwo(int n) {
        int base = 2;
        int power = 0;
        long value = 1;
        if (n == 1) {
            return true;
        }
        return getPower(n, base, power, value);
    }

    public boolean getPower(int n, int base, int power, long value) {
        value = value * 2;
        if (value > n) {
            return false;
        }
        if (value == n) {
            return true;
        }
        return getPower(n, base, power + 1, value);
    }

    //approach 2
    //tc -> O(1) and sc -> O(1)
    public boolean getNumberOfPowerTwo_2(int n) {
        return n>0 && ((n & (n-1))==0);
    }
}
