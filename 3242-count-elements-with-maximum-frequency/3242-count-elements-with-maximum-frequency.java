class Solution {

    public int maxFrequencyElements(int[] nums) {
        return getMaxFrequency(nums);
    }

    public int getMaxFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 1;
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                maxFreq = Math.max(maxFreq, map.get(i));
            } else {
                map.put(i, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                count = count + entry.getValue();
            }
        }
        return count;
    }
}
