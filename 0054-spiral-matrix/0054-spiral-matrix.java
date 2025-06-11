class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        return sprialOrderPrint(matrix);
    }

    public List<Integer> sprialOrderPrint(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (N > 1 && M > 1) {
            for (int l = 1; l < M; l++) {
                list.add(mat[i][j]);
                j++;
            }
            for (int l = 1; l < N; l++) {
                list.add(mat[i][j]);
                i++;
            }
            for (int l = 1; l < M; l++) {
                list.add(mat[i][j]);
                j--;
            }
            for (int l = 1; l < N; l++) {
                list.add(mat[i][j]);
                i--;
            }
            i++;
            j++;
            N = N - 2;
            M = M - 2;
        }
        if (M > 1 && N == 1) {
            for (int l = 0; l < M; l++) {
                list.add(mat[i][j]);
                j++;
            }
        }
        if (M == 1 && N > 1) {
            for (int l = 0; l < N; l++) {
                list.add(mat[i][j]);
                i++;
            }
        }

        if (N == 1 && M == 1) {
            list.add(mat[i][j]);
        }
        return list;
    }
}
