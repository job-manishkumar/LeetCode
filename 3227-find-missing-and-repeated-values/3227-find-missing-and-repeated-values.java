class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        return getMissingAndRepeatedValues_2(grid);
    }

    //approach 1
    //tc -> O(n2) and sc -> O(n2)
    public int[] getMissingAndRepeatedValues(int[][] mat) {
        int[] ans = new int[2];
        int min = mat.length * mat.length + 1;
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (set.contains(mat[i][j])) {
                    ans[0] = mat[i][j];
                }
                set.add(mat[i][j]);
            }
        }
        for (int i = 1; i <= mat.length * mat.length; i++) {
            if (!set.contains(i)) {
                ans[1] = i;
            }
        }
        return ans;
    }

    //approach 2
    public int[] getMissingAndRepeatedValues_2(int[][] mat) {
        int[] ans = new int[2];
        int[] count = new int[mat.length * mat.length + 1];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                count[mat[i][j]]++;
            }
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) {
                ans[0] = i;
            }
            if (count[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}
