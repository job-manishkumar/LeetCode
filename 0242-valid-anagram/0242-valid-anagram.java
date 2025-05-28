class Solution {
    public boolean isAnagram(String s, String t) {
        return isStringAnagram(s,t);
    }
    public boolean isStringAnagram(String str1, String str2) {
        if(str1 == null || str2 == null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            if(map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
        
    }
}