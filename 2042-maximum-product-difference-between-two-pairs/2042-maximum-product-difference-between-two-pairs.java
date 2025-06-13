class Solution {

    public int maxProductDifference(int[] nums) {
        return getMaxProduct_2(nums);
    }

    //approach 1 -using max,secondmax,min,secondmin
    //tc -> O(n) and sc ->O(1)
    public int getMaxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i : arr) {
            if (max < i) {
                secondMax = max;
                max = i;
            } else if (secondMax < i) {
                secondMax = i;
            }
            if (min > i) {
                secondMin = min;
                min = i;
            } else if (secondMin > i) {
                secondMin = i;
            }
        }

        int prod1 = max * secondMax;
        int prod2 = min * secondMin;

        return prod1 - prod2;
    }

    //approach 2 - using priorityqueue
    public int getMaxProduct_2(int[] arr) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        for (int i : arr) {
            pq1.add(i);
        }
        int prod2 = pq1.poll() * pq1.poll();

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            pq2.add(i);
        }
        int prod1 = pq2.poll() * pq2.poll();

        return prod1 - prod2;
    }
}
