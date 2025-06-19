class Solution {

    public List<Integer> luckyNumbers(int[][] matrix) {
        return getLuckyNumber(matrix);
    }

    public List<Integer> getLuckyNumber(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < m; j++) {
                if (min > mat[i][j]) {
                    min = mat[i][j];
                    index = j;
                }
            }
            map.put(min, index);
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getKey()) {
                max = entry.getKey();
                maxIndex = entry.getValue();
            }
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max2 = Math.max(max2, mat[i][maxIndex]);
        }
        if (max == max2) {
            List<Integer> temp = new ArrayList<>();
            temp.add(max);
            return temp;
        }

        return new ArrayList<>();
    }
}
