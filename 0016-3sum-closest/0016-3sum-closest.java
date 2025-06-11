class Solution {

    public int threeSumClosest(int[] nums, int target) {
        return findThreeSumClosest(nums, target);
    }

    public int findThreeSumClosest(int[] arr, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j1 = i + 1;
            int j2 = arr.length - 1;
            while (j1 < j2) {
                int sum = arr[i] + arr[j1] + arr[j2];
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }
                if (sum < target) {
                    j1++;
                } else {
                    j2--;
                }
            }
        }
        return closest;
    }
}
