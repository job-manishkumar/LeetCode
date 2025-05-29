class Solution {
    public int firstUniqChar(String s) {
        return findFirstUniqChar(s);
    }

    public int findFirstUniqChar(String s) {
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(map[index]==0){
                map[index] = 1;
            }
            else{
                map[index] = map[index]+1;
            }
        }
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        
        return -1;
    }
}