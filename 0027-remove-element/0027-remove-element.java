class Solution {

    public int removeElement(int[] nums, int val) {
        return removeGivenElement(nums, val);
    }

    public int removeGivenElement(int[] arr, int val) {
        int i = 0;
        int index = 0;
        while (i < arr.length) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
            i++;
        }
        return index;
    }
}
