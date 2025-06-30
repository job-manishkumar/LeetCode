class Solution {

    public int findLHS(int[] nums) {
        return getFindLHS_3(nums);
    }

    //approach 1 -brute force
    //tc -> O(N2) and sc -> O(N)
    public int getFindLHS(int[] arr) {
        int max = 0;
        int maxElement = 0;
        int minElement = 0;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                if (i != j && ((arr[j] == arr[i]) || (arr[j] == arr[i] + 1))) {
                    list.add(arr[j]);
                }
            }
            maxElement = getMax(list);
            minElement = getMin(list);
            //System.out.println(maxElement + "  ;  " + minElement);
            if ((maxElement - minElement) == 1) {
                max = Math.max(max, list.size());
            }
        }
        return max;
    }

    public int getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int getMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    //approach 2 - using map
    //tc -> O(n) and sc -> O(n)
    public int getFindLHS_2(int[] arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                max = Math.max(max, (map.get(i) + map.get(i + 1)));
            }
        }
        return max;
    }

    //approach 3
    public int getFindLHS_3(int[] arr) {
        Arrays.sort(arr);
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < arr.length) {
            while (arr[r] - arr[l] > 1) {
                l++;
            }
            if (arr[r] != arr[l]) {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max;
    }
}
