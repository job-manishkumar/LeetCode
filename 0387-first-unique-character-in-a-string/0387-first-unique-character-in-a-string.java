class Solution {

    public int firstUniqChar(String s) {
        return getFirstUniqChar_2(s);
    }

    //approach 1 - using map
    //tc -> O(n) and sc -> O(n)
    public int getFirstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    //approach 2 - using array
    //tc -> O(n) and sc -> O(1)
    public int getFirstUniqChar_2(String s) {
        int[] ch = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
