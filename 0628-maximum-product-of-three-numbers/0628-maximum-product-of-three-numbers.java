class Solution {

    public int maximumProduct(int[] nums) {
        return maxProduct(nums);
    }

    public int maxProduct(int[] arr) {
        int[] ele = getMaxElement(arr);
        return Math.max(getTwoMinElementProduct(arr) * ele[0], getTwoMaxElementProduct(arr) * ele[1]);
    }

    public int[] getMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                third = second;
                second = max;
                max = i;
            } else if (second < i) {
                third = second;
                second = i;
            } else if (third < i) {
                third = i;
            }
        }
        return new int[] { max, third };
    }

    public int getTwoMinElementProduct(int[] arr) {
        for (int i = 0; i < 2; i++) {
            int min_index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            //swap bwt arr[i] and arr[min_index];
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr[0] * arr[1];
    }

    public int getTwoMaxElementProduct(int[] arr) {
        for (int i = 0; i < 2; i++) {
            int max_index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            //swap bwt arr[i] and arr[min_index];
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
        return arr[0] * arr[1];
    }
}
