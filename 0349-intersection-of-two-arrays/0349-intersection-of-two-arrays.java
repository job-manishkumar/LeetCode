class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        return getIntersectionElements(nums1, nums2);
    }

    public int[] getIntersectionElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            set2.add(i);
        }
        for (int i : set1) {
            if (set2.contains(i)) {
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
