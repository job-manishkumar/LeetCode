class Solution {

    public int[][] diagonalSort(int[][] mat) {
        return sortDiagonal(mat);
    }

    public int[][] sortDiagonal(int[][] mat) {
        for (int col = 0; col < mat[0].length; col++) {
            List<Integer> list = printDiagonal(mat, 0, col);
            addMatrix(mat, 0, col, list);
        }
        for(int row =1;row<mat.length;row++){
            List<Integer> list = printDiagonal(mat, row, 0);
            addMatrix(mat, row, 0, list);
        }
        return mat;
    }

    public List<Integer> printDiagonal(int[][] mat, int row, int col) {
        List<Integer> list = new ArrayList<>();
        while (row < mat.length && col < mat[0].length) {
            list.add(mat[row][col]);
            Collections.sort(list);
            row++;
            col++;
        }
        return list;
    }

    public void addMatrix(int[][] mat, int row, int col, List<Integer> list) {
        int index = 0;
        while (row < mat.length && col < mat[0].length) {
            mat[row][col] = list.get(index);
            row++;
            col++;
            index++;
        }
    }
}
