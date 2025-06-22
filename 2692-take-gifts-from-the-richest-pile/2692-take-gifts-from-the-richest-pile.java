class Solution {

    public long pickGifts(int[] gifts, int k) {
        return sumOfPickGifts(gifts, k);
    }

    public long sumOfPickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
        for (long i : gifts) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            pq.add((long) Math.sqrt(pq.poll()));
        }
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
