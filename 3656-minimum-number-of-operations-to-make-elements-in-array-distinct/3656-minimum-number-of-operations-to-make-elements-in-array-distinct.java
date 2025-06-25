class Solution {

    public int minimumOperations(int[] nums) {
        return getMinimumOperations(nums);
    }

    public int getMinimumOperations(int[] arr) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (!isPresent(arr, i, arr.length - 1)) {
                return count;
            }
            i = i + 3;
            count++;
        }
        return count;
    }

    public boolean isPresent(int[] arr, int si, int ei) {
        Set<Integer> set = new HashSet<>();
        for (int i = si; i <= ei; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
