class Solution {

    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstring1(s);
    }

    public int lengthOfLongestSubstring1(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLength = 1;
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                int index = map.get(s.charAt(j));
                i = index + 1;
            }
            map.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
