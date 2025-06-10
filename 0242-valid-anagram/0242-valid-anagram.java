class Solution {

    public boolean isAnagram(String s, String t) {
        return checkAnagram(s, t);
    }

    public boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] ch = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (ch[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            ch[t.charAt(i) - 'a']--;
        }
        return true;
    }
}
