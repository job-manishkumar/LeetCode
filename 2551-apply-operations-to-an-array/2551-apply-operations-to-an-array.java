class Solution {

    public int[] applyOperations(int[] nums) {
        return getModidfyArray(nums);
    }

    public int[] getModidfyArray(int[] arr) {
        int[] st = new int[arr.length];
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            if (top > 0 && st[top - 1] == arr[i]) {
                int val = st[top - 1];
                top--;
                st[top] = val * 2;
                top++;
                st[top] = 0;
                top++;
            } else {
                st[top] = arr[i];
                top++;
            }
        }
        zeroToEnd(st);
        return st;
    }

    public void zeroToEnd(int[] arr) {
        int nz = 0;
        int z = 0;
        while (nz < arr.length) {
            if (arr[nz] != 0) {
                //swap arr[nz] and arr[z]
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
