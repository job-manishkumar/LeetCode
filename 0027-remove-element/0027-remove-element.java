class Solution {

    public int removeElement(int[] nums, int val) {
        return removeAllElement(nums,val);
    }

    public int removeAllElement(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
