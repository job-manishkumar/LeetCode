class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
        return get2DArray(original, m, n);
    }

    //approach 1
    //tc -> O(n2) and sc - > O(n2)
    public int[][] get2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[][] {};
        }
        int[][] ans = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[index];
                index++;
            }
        }
        return ans;
    }
}
