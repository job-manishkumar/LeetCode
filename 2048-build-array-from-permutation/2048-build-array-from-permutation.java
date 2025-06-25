class Solution {
    public int[] buildArray(int[] nums) {
        return getBuildArray(nums);
    }

    public int[] getBuildArray(int[] arr){
        int[] ans = new int[arr.length];
        int index = 0;
        for(int i:arr){
            ans[index] = arr[i];
            index++;
        }
        return ans;
    }
}