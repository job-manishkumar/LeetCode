class Solution {

    public int majorityElement(int[] nums) {
        return findMajorityElementg(nums);
    }

    public int findMajorityElementg(int[] arr) {
        int majElement = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (freq == 0) {
                majElement = arr[i];
                freq = 1;
            } else if (arr[i] != majElement) {
                freq--;
            } else {
                freq++;
            }
        }
        return majElement;
    }
}
