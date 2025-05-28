class Solution {
    public int[] twoSum(int[] nums, int target) {
        return getTwoSum(nums, target);
    }

    public int[] getTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int secondValue = target - arr[i];
            if (map.containsKey(secondValue)) {
                return new int[] { map.get(secondValue), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }
}