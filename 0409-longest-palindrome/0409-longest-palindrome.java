class Solution {

    public int longestPalindrome(String s) {
        return getLongestPal_2(s);
    }

    //approach 1
    //tc -> O(n) and sc -> (n)
    public int getLongestPal(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        int oneChar = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                count = count + entry.getValue();
            } else {
                count = count + entry.getValue() - 1;
                oneChar = 1;
            }
        }
        return count + oneChar;
    }

    //approach 2
    //tc -> O(n) and sc -> O(1)
    public int getLongestPal_2(String s) {
        int[] ch = new int[52];
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                ch[c - 'A']++;
            } else {
                ch[c - 'a' + 26]++;
            }
        }
        int count = 0;
        int oneChar = 0;
        for (int i : ch) {
            if (i % 2 == 0) {
                count = count + i;
            } else {
                count = count + (i - 1);
                oneChar = 1;
            }
        }
        return count + oneChar;
    }
}
