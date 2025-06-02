class Solution {

    public void moveZeroes(int[] nums) {
        moveZeroesToEnd(nums);
    }

    public void moveZeroesToEnd(int[] arr) {
        int nz = 0;
        int z = 0;
        while (nz < arr.length) {
            if (arr[nz] != 0) {
                //swap arr[nz] and arr[z];
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
}
