class Solution {

    public boolean canBeEqual(int[] target, int[] arr) {
        return isEqual_2(target, arr);
    }

    //approach 1
    //tc -> O(nlogn) and sc ->O(1)
    public boolean isEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    //approach 2 --using map
    //tc -> O(nlogn) and sc ->O(1)
    public boolean isEqual_2(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : target) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (!map.containsKey(i)) {
                return false;
            }
            if (map.get(i) == 0) {
                return false;
            }
            map.put(i, map.get(i) - 1);
        }
        return true;
    }
}
