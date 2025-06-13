class Solution {

    public int maxProduct(int[] nums) {
        return getProduct_3(nums);
    }

    //appraoch 1
    //tc -> O(nlogn) and sc - > O(1)
    public int getProduct(int[] arr) {
        Arrays.sort(arr);
        return (arr[arr.length - 1] - 1) * (arr[arr.length - 2] - 1);
    }

    //approach 2
    //tc -> O(n) and sc -> O(1)
    public int getProduct_2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                second = max;
                max = i;
            } else if (second < i) {
                second = i;
            }
        }
        return (max - 1) * (second - 1);
    }

    //apprach 3
    //tc -> (nlogn) and sc -> O(1)
    public int getProduct_3(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            pq.add(i);
        }
        return (pq.poll() - 1) * (pq.poll() - 1);
    }
}
