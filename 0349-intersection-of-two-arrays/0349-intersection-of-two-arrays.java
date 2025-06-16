class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        return getIntersectionElements_2(nums1, nums2);
    }

    //approach 1 - using set
    //tc -> O(n) and sc -> O(n)
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

    //approach 2 - using arr
    public int[] getIntersectionElements_2(int[] arr1, int[] arr2) {
        int[] ch = new int[1001];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            ch[arr1[i]]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (ch[arr2[i]] > 0) {
                ch[arr2[i]] = -1;
                count++;
            }
        }
        int[] ans = new int[count];
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == -1) {
                ans[index] = i;
                index++;
            }
        }
        return ans;
    }
}
