class Solution {

    public int timeRequiredToBuy(int[] tickets, int k) {
        return timeToBuy_2(tickets, k);
    }

    //approach 1 -- using queue
    //tc -> O(n*Max(queueSize)) and sc -> O(n)
    public int timeToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int totalTime = 0;
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }
        while (tickets[k] > 0) {
            int index = queue.poll();
            tickets[index] = tickets[index] - 1;
            totalTime++;
            if (tickets[index] != 0) {
                queue.add(index);
            }
        }
        return totalTime;
    }

    //approach 2
    //tc -> O(n) and sc -> O(1)
    public int timeToBuy_2(int[] tickets, int k) {
        int totalTime = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                totalTime += Math.min(tickets[i], tickets[k]);
            } else {
                totalTime += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return totalTime;
    }
}
