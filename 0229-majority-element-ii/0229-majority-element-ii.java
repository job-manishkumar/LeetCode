class Solution {

    public List<Integer> majorityElement(int[] nums) {
        return findMajorityElements(nums);
    }

    public List<Integer> findMajorityElements(int[] arr) {
        int majElement1 = Integer.MIN_VALUE;
        int majElement2 = Integer.MIN_VALUE;
        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majElement1) {
                freq1++;
            } else if (arr[i] == majElement2) {
                freq2++;
            } else if (freq1 == 0) {
                majElement1 = arr[i];
                freq1=1;
            } else if (freq2 == 0) {
                majElement2 = arr[i];
                freq2=1;
            } else {
                freq1--;
                freq2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(majElement1==arr[i]){
                count1++;
            }
            if(majElement2==arr[i]){
                count2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(count1>arr.length/3){
            list.add(majElement1);
        }
        if(count2>arr.length/3){
            list.add(majElement2);
        }
        return list;
    }
}
