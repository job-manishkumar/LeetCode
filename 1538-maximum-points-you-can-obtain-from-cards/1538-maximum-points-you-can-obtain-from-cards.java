class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            leftSum = leftSum + cardPoints[i];
            maxSum = Math.max(maxSum,leftSum);
        }
        for(int i=0;i<k;i++){
            leftSum = leftSum - cardPoints[k-1-i];
            rightSum = rightSum + cardPoints[cardPoints.length-1-i];
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
        
    }
}