class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        return getArray(nums, k, multiplier);
    }

    class Pair2 {
        int value;
        int index;

        public Pair2(int val, int i) {
            this.value = val;
            this.index = i;
        }
    }

    public int[] getArray(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair2> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.value != b.value) return a.value - b.value;
                return a.index - b.index;
            }
        );
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair2(nums[i], i));
        }
        while (k > 0) {
            Pair2 pair = pq.poll();
            int val = pair.value * multiplier;
            nums[pair.index] = val;
            pq.add(new Pair2(val, pair.index));
            k--;
        }
        return nums;
    }
}
