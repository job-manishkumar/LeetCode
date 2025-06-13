class Solution {

    public char findTheDifference(String s, String t) {
        return findDiff_2(s, t);
    }

    //approach 1 using hashmap
    //tc -> O(n) and sc -> O(n)
    public char findDiff(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return ch;
            }
            if (map.get(ch) == 0) {
                return ch;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return '\0';
    }

    //approach 2 using array
    //tc -> O(n) and sc -> O(1)
    public char findDiff_2(String s, String t) {
        int[] ch = new int[26];
        for (char c1 : s.toCharArray()) {
            ch[c1 - 'a']++;
        }
        for (char c2 : t.toCharArray()) {
            if (ch[c2 - 'a'] == 0) {
                return c2;
            }
            ch[c2 - 'a']--;
        }
        return '\0';
    }
}
