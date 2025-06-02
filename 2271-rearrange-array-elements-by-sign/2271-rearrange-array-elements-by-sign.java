class Solution {

    public int[] rearrangeArray(int[] nums) {
        return reArrangeSignArray(nums);
    }

    public int[] reArrangeSignArray(int[] arr) {
        int[] positiveArr = new int[arr.length / 2];
        int[] negativeArr = new int[arr.length / 2];
        int positiveIndex = 0;
        int negativeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[positiveIndex] = arr[i];
                positiveIndex++;
            } else {
                negativeArr[negativeIndex] = arr[i];
                negativeIndex++;
            }
        }
        int index = 0;
        positiveIndex = 0;
        negativeIndex = 0;
        while (positiveIndex < positiveArr.length && negativeIndex < negativeArr.length) {
            if (index % 2 == 0) {
                arr[index] = positiveArr[positiveIndex];
                index++;
                positiveIndex++;
            } else {
                arr[index] = negativeArr[negativeIndex];
                index++;
                negativeIndex++;
            }
        }
        while (positiveIndex < positiveArr.length) {
            arr[index] = positiveArr[positiveIndex];
            index++;
            positiveIndex++;
        }
        while (negativeIndex < negativeArr.length) {
            arr[index] = negativeArr[negativeIndex];
            index++;
            negativeIndex++;
        }

        return arr;
    }
}
