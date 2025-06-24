class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        return getKDistantIndices_2(nums, key, k);
    }

    //approach1
    //tc -> O(n2) and sc -> (n)
    public List<Integer> getKDistantIndices(int[] nums, int key, int k) {
        //find all the indices where key is present in nums
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (key == nums[i]) {
                list.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            while (index < list.size()) {
                if (Math.abs(i - list.get(index)) <= k) {
                    ans.add(i);
                    break;
                } else {
                    index++;
                }
            }
        }
        return ans;
    }

    //approach 2

    public List<Integer> getKDistantIndices_2(int[] nums, int key, int k) {
        //find all the indices where key is present in nums
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (key == nums[i]) {
                list.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums.length && j < list.size()) {
            if (i - list.get(j) <= k && Math.abs(i - list.get(j)) <= k) {
                ans.add(i);
            } else if (i - list.get(j) > k) {
                j++;
                if (j < list.size() && Math.abs(i - list.get(j)) <= k) {
                    ans.add(i);
                }
            }
            i++;
        }
        return ans;
    }
}
