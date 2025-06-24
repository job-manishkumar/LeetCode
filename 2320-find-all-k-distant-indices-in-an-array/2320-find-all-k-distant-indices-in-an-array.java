class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        return getKDistantIndices(nums, key, k);
    }

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
        System.out.println(ans);
        return ans;
    }
}
