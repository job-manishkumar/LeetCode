class Solution {

    public int countHillValley(int[] nums) {
        return getCountHillValley_2(nums);
    }

    //approach 1
    //tc -> O(n2) and sc -> O(1)
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

    public int getCountHillValley_2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1) || list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
