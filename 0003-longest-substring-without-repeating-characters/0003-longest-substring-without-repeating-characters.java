class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray(); // O(n)
        int l = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < ch.length; r++) {
            if (map.containsKey(ch[r]) && map.get(ch[r]) >= l) {
                l = map.get(ch[r]) + 1;
            }
            map.put(ch[r], r);
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
