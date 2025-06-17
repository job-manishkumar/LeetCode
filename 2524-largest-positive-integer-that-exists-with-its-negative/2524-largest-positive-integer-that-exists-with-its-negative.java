class Solution {

    public int findMaxK(int[] nums) {
        return findMax_3(nums);
    }

    //approach 1 -using sorting and two pointer
    //tc -> O(nlogn) and sc -> O(1)
    public int findMax(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j && arr[i] < 0 && arr[j] > 0) {
            if (Math.abs(arr[i]) == arr[j]) {
                return arr[j];
            } else if (Math.abs(arr[i]) < arr[j]) {
                j--;
            } else {
                i++;
            }
        }
        return -1;
    }

    //approach 2 -using set
    //tc -> O(n) and sc -> O(n)
    public int findMax_2(int[] arr) {
        int max = -1;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * -1)) {
                max = Math.max(max, Math.abs(i));
            }
            set.add(i);
        }
        return max;
    }

    //approach 3
    //tc -> O(n) and sc -> O(1)
    public int findMax_3(int[] arr) {
        int[] index = new int[2001];
        int max = -1;
        for (int i : arr) {
            index[i + 1000] = index[i + 1000] + 1;
        }
        for (int i : arr) {
            if (i < 0 && index[Math.abs(i) + 1000] > 0) {
                max = Math.max(max, Math.abs(i));
            }
        }
        return max;
    }
}
