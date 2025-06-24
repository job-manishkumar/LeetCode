class Solution {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        return merge2DArrays(nums1, nums2);
    }

    public int[][] merge2DArrays(int[][] arr1, int[][] arr2) {
        int p1 = 0;
        int p2 = 0;
        List<List<Integer>> temp = new ArrayList<>();
        while (p1 < arr1.length && p2 < arr2.length) {
            List<Integer> list = new ArrayList<>();
            if (arr1[p1][0] == arr2[p2][0]) {
                list.add(arr1[p1][0]);
                list.add(arr1[p1][1] + arr2[p2][1]);
                p1++;
                p2++;
            } else if (arr1[p1][0] < arr2[p2][0]) {
                list.add(arr1[p1][0]);
                list.add(arr1[p1][1]);
                p1++;
            } else {
                list.add(arr2[p2][0]);
                list.add(arr2[p2][1]);
                p2++;
            }
            temp.add(list);
        }
        while (p1 < arr1.length) {
            List<Integer> list = new ArrayList<>();
            list.add(arr1[p1][0]);
            list.add(arr1[p1][1]);
            temp.add(list);
            p1++;
        }
        while (p2 < arr2.length) {
            List<Integer> list = new ArrayList<>();
            list.add(arr2[p2][0]);
            list.add(arr2[p2][1]);
            temp.add(list);
            p2++;
        }
        int[][] ans = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) {
            ans[i][0] = temp.get(i).get(0);
            ans[i][1] = temp.get(i).get(1);
        }
        return ans;
    }
}
