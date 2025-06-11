class Solution {

    public int trap(int[] height) {
        return getTrapWater(height);
    }

    public int getTrapWater(int[] arr) {
        int[] lmax = new int[arr.length];
        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }
        int[] rmax = new int[arr.length];
        rmax[rmax.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            water = water + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        return water;
    }
}
