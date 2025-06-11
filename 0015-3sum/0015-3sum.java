class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        return getThreeSum(nums);
    }

    public List<List<Integer>> getThreeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                int b = -(target + arr[j]);
                if (map.containsKey(b)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(target);
                    temp.add(arr[j]);
                    temp.add(b);
                    Collections.sort(temp);
                    set.add(temp);
                } else if (map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
            }
        }
        return new ArrayList<>(set);
        
    }
}
