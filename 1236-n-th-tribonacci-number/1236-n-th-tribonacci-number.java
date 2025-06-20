class Solution {

    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return getTribonacci_2(n, dp);
    }

    //tc -> O(3^n) and sc -> O(n) // TLE
    public int getTribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return getTribonacci(n - 3) + getTribonacci(n - 2) + getTribonacci(n - 1);
    }

    //approach 2 using dp memoization
    public int getTribonacci_2(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (dp[n] == -1) {
            dp[n] = getTribonacci_2(n-1,dp) + getTribonacci_2(n - 2,dp) + getTribonacci_2(n - 3,dp);
        }
        return dp[n];
    }
}
