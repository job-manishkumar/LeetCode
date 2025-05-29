class Solution {

    public int longestPalindrome(String s) {
        return getLongestPalindrome(s);
    }

    public int getLongestPalindrome(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        int oneChar = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                count = count + entry.getValue();
            } else {
                count = count + entry.getValue() - 1;
                oneChar = 1;
            }
        }
        return count + oneChar;
    }
}
