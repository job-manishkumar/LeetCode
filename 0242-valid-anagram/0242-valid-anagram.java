class Solution {

    public boolean isAnagram(String s, String t) {
        return checkAnagram_3(s, t);
    }

    //approach 1 - sorting
    //tc -> O(nlogn) and sc ->O(1)
    public boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    //approach 2 - using hashmap
    //tc ->O(n) and sc -> O(n)
    public boolean checkAnagram_2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            if (map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    //approach 3 -- using char array
    public boolean checkAnagram_3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] ch = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (ch[c - 'a'] == 0) {
                return false;
            }
            ch[c - 'a']--;
        }
        return true;
    }
}
