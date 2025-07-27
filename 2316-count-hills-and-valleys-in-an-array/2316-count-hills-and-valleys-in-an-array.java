class Solution {

    public int countHillValley(int[] nums) {
        return getCountHillValley(nums);
    }

    public int getCountHillValley(int[] nums) {
        int hill = 0;
        int valley = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int num1 = nums[0];
            int num2 = nums[nums.length - 1];
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] != nums[j]) {
                    num1 = nums[j];
                    break;
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    num2 = nums[j];
                    break;
                }
            }
            if (nums[i] > num1 && nums[i] > num2 && nums[i] != nums[i - 1]) {
                hill++;
            }
            if (nums[i] < num1 && nums[i] < num2 && nums[i] != nums[i - 1]) {
                valley++;
            }
        }
        return hill + valley;
    }
}
