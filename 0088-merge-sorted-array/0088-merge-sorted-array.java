class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
         mergeTwoArrays(nums1, m, nums2, n);
    }

    public void mergeTwoArrays(int[] arr1, int len1, int[] arr2, int len2) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] ans = new int[len1 + len2];
        while (p1 < len1 && p2 < len2) {
            if (arr1[p1] <= arr2[p2]) {
                ans[p3] = arr1[p1];
                p3++;
                p1++;
            } else {
                ans[p3] = arr2[p2];
                p3++;
                p2++;
            }
        }
        while (p1 < len1) {
            ans[p3] = arr1[p1];
            p3++;
            p1++;
        }
        while (p2 < len2) {
            ans[p3] = arr2[p2];
            p3++;
            p2++;
        }

        //copy all value from ans to arr1
        int index = 0;
        for (int i : ans) {
            arr1[index] = i;
            index++;
        }
    }
}
