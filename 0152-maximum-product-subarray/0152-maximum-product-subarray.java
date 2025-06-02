class Solution {

    public int maxProduct(int[] nums) {
        return getMaxProduct(nums);
    }

    public int getMaxProduct(int[] arr) {
        int prefixProd = 1;
        int suffixProd = 1;
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            prefixProd = prefixProd==0?1:prefixProd;
            suffixProd = suffixProd==0?1:suffixProd;
            prefixProd = prefixProd * arr[i];
            suffixProd = suffixProd * arr[n - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefixProd, suffixProd));
        }
        return maxProduct;
    }
}
