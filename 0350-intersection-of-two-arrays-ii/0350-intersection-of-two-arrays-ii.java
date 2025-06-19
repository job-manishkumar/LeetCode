class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        return intersectArray_2(nums1, nums2);
    }

    //approach 1 using Map
    //tc -> O(n) and sc -> O(n)
    public int[] intersectArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    //approach 2 using array
    //tc -> O(n) and sc -> O(n)
    public int[] intersectArray_2(int[] arr1, int[] arr2) {
        int[] ch = new int[1001];
        List<Integer> list = new ArrayList();
        for (int i : arr1) {
            ch[i]++;
        }
        for (int i : arr2) {
            if (ch[i] > 0) {
                list.add(i);
                ch[i]--;
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
