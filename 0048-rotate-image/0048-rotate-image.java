class Solution {

    public void rotate(int[][] matrix) {
        rotateImage(matrix);
    }

    public void rotateImage(int[][] mat) {
        transpose(mat);
        for (int row = 0; row < mat.length; row++) {
            int i = 0;
            int j = mat[row].length - 1;
            while (i < j) {
                int temp = mat[row][i];
                mat[row][i] = mat[row][j];
                mat[row][j] = temp;
                i++;
                j--;
            }
        }
    }

    public void transpose(int[][] mat) {
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
