class Solution {

    public int[] twoSum(int[] numbers, int target) {
        return getTwoSum(numbers, target);
    }

    public int[] getTwoSum(int[] arr, int target) {
        //using two pointer
        // tc -> O(N) and sc -> O(1)
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
}
