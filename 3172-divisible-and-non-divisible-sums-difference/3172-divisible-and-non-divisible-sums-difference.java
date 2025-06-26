class Solution {

    public int differenceOfSums(int n, int m) {
        return getDifferenceOfSums_2(n, m);
    }

    //approach 1
    //tc -> O(n) and sc -> O(1)
    public int getDifferenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum2 = sum2 + i;
            } else {
                sum1 = sum1 + i;
            }
        }
        return sum1 - sum2;
    }

    //approach 2 -- using math formula
    //tc -> O(1) and sc -> O(1)
    public int getDifferenceOfSums_2(int n, int m) {
        int sumOfN = n * (n + 1) / 2;
        int firstNo = 0;
        if (n >= m) {
            firstNo = m;
        }
        int sumOfM = ((n / m) * (2 * firstNo + ((n / m) - 1) * m)) / 2;
        return sumOfN - 2 * sumOfM;
    }
}
