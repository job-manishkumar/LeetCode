class Solution {
    public int thirdMax(int[] nums) {
        return thirdMaxElement(nums);
    }
    public int thirdMaxElement(int[] arr){
        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                third = second;
                second = max;
                max = arr[i];
            }
            else if(second<arr[i] && arr[i]!=max){
                third = second;
                second = arr[i];
            }
            else if(third< arr[i] && arr[i]!=second && arr[i]!=max){
                third = arr[i];
            }
        }
        return third==Long.MIN_VALUE?(int)max:(int)third;
    }
}