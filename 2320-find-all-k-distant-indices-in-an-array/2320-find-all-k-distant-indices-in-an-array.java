class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        return getFindKDistantIndices_2(nums, key, k);
    }

    //appraoch 1
    //tc -> O(n2) and sc - > O(n)
    public List<Integer> getFindKDistantIndices(int[] arr, int key, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { //O{n}
            if (key == arr[i]) {
                list.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (Math.abs(i - list.get(j)) <= k) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }

    //appraoch 2
    //tc -> O(n2) and sc - > O(n)
    public List<Integer> getFindKDistantIndices_2(int[] arr, int key, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { //O{n}
            if (key == arr[i]) {
                list.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr.length && j < list.size()) {
            if (Math.abs(i - list.get(j)) > k) {
                if (i - list.get(j) < 0) {
                    i++;
                } else {
                    j++;
                }
            } else {
                ans.add(i);
                i++;
            }
        }
        return ans;
    }
}
