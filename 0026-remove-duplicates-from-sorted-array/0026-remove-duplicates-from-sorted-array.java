class Solution {

    public int removeDuplicates(int[] nums) {
        return removeDuplicateElements(nums);
    }

    public int removeDuplicateElements(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
            
        }
        return index+1;
    }
}
