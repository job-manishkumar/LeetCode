class Solution {

    public boolean divideArray(int[] nums) {
        return isDivideArray_2(nums);
    }

    //approach 1
    //tc -> O(n) and sc -> O(1)
    public boolean isDivideArray(int[] arr) {
        int[] count = new int[501];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //approach 2 -- using map
    public boolean isDivideArray_2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
