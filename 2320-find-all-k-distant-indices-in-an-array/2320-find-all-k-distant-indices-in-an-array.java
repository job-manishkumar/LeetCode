class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        return getFindKDistantIndices(nums, key, k);
    }

    //appraoch 1
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
}
