class Solution {
    public int totalFruit(int[] fruits) {
        
        int l=0;
        Map<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        for(int r=0;r<fruits.length;r++){
           if(map.containsKey(fruits[r])){
                map.put(fruits[r],map.get(fruits[r])+1);
           }
           else{
                map.put(fruits[r],1);
           }
           if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
           }
           if(map.size()<=2){
                maxLength = Math.max(maxLength,r-l+1);
           }
        }
        return maxLength;
    }
}