class Solution {

    public int[] twoSum(int[] nums, int target) {
        return getTwoSumIndices(nums, target);
    }

    public int[] getTwoSumIndices(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int b = target - arr[i];
            if (map.containsKey(b)) {
                return new int[] { map.get(b), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }
}
