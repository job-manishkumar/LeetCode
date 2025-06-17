class Solution {

    public int findMaxK(int[] nums) {
        return findMax_2(nums);
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

    //approach 1 -using sorting and two pointer
    //tc -> O(n) and sc -> O(n)
    public int findMax_2(int[] arr) {
        int max = -1;
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i*-1)){
              max =   Math.max(max,Math.abs(i));
            }
            set.add(i);
        }
        return max;
    }
}
