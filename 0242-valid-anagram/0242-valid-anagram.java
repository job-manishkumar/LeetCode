class Solution {

    public boolean isAnagram(String s, String t) {
        return checkAnagram(s, t);
    }

    public boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] ch = new int[26];
        for (char c:s.toCharArray()) {
            ch[c - 'a']++;
        }
        for (char c:t.toCharArray()) {
            if (ch[c - 'a'] == 0) {
                return false;
            }
            ch[c - 'a']--;
        }
        return true;
    }
}
