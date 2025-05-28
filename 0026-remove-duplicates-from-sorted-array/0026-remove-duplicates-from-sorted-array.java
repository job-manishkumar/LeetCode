class Solution {

    public int removeDuplicates(int[] nums) {
        return revmoveDuplicateElement(nums);
    }

    public int revmoveDuplicateElement(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }
}
