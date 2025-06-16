class Solution {

    public int[] sortedSquares(int[] nums) {
        return getSquares_3(nums);
    }

    //approach 1
    //tc -> O(nlogn) and sc -> O(1)
    public int[] getSquares(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i : arr) {
            ans[index] = i * i;
            index++;
        }

        Arrays.sort(ans);
        return ans;
    }

    //approach 2 -- using priorityQueue
    public int[] getSquares_2(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i * i);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }

    //approach 3 -- using two pointer
    public int[] getSquares_3(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int[arr.length];
        int index = ans.length - 1;
        while (i <= j) {
            int squareOfI = arr[i] * arr[i];
            int squareOfJ = arr[j] * arr[j];
            if (squareOfI < squareOfJ) {
                ans[index] = squareOfJ;
                j--;
                index--;
            } else {
                ans[index] = squareOfI;
                i++;
                index--;
            }
        }
        return ans;
    }
}
