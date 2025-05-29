class Solution {
    public char findTheDifference(String s, String t) {
        return findDifference(s,t);
    }
    public char findDifference(String s, String t) {
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
           int  index = s.charAt(i) - 'a';
           map[index] = map[index]+1;
        }
        char c = Character.MIN_VALUE;
        for(int i=0;i<t.length();i++){
            if (map[t.charAt(i) - 'a'] == 0) {
				c = t.charAt(i);
                break;
			} else {
				map[t.charAt(i) - 'a']--;
			}
        }
        return c;
    }
}
