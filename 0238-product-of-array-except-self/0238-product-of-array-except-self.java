class Solution {

    public int[] productExceptSelf(int[] nums) {
        return getProductExceptSeft(nums);
    }

    public int[] getProductExceptSeft(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }
        int suffix = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = suffix * arr[i];
        }
        return ans;
    }
}
