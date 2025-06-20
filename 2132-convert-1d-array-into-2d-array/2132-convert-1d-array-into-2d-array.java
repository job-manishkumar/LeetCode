class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        return get2DArray(original, m, n);
    }

    public int[][] get2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index == original.length) {
                    return new int[][] {};
                }
                ans[i][j] = original[index];
                index++;
            }
        }
        if (index == original.length) {
            return ans;
        }
        return new int[][] {};
    }
}
