class Solution {
    public int maxProduct(int[] nums) {
        return getProduct(nums);
    }

    //appraoch 1
    public int getProduct(int[] arr){
        Arrays.sort(arr);
        return (arr[arr.length-1]-1)*(arr[arr.length-2]-1);
    }
}