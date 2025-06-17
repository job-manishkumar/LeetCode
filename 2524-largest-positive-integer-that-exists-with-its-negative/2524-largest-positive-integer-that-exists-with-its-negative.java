class Solution {

    public int findMaxK(int[] nums) {
        return findMax(nums);
    }

    //approach 1 -using sorting and two pointer
    //tc -> O(nlogn) and sc -> O(1)
    public int findMax(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j && arr[i] < 0 && arr[j] > 0) {
            if (Math.abs(arr[i]) == arr[j]) {
                return arr[j];
            } else if (Math.abs(arr[i]) < arr[j]) {
                j--;
            } else {
                i++;
            }
        }
        return -1;
    }
}
