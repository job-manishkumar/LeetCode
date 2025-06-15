class Solution {

    public int maxLengthBetweenEqualCharacters(String s) {
        return getMaxLength_2(s);
    }

    //approach 1 -- using Map
    //tc -> O(n) and sc ->O(n)
    public int getMaxLength(String str) {
        int maxLength = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < str.length(); r++) {
            if (map.containsKey(str.charAt(r))) {
                maxLength = Math.max(maxLength, r - map.get(str.charAt(r)) - 1);
            } else {
                map.put(str.charAt(r), r);
            }
        }
        return maxLength;
    }

    //approach 2 -- using array
    //tc -> O(n) and sc ->O(1)
    public int getMaxLength_2(String str) {
        int[] ch = new int[26];
        int maxLength = -1;
        for (int i = 0; i < ch.length; i++) {
            ch[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch[str.charAt(i) - 'a'] != -1) {
                maxLength = Math.max(maxLength, i - ch[str.charAt(i)-'a'] - 1);
            } else {
                ch[str.charAt(i) - 'a'] = i;
            }
        }
        return maxLength;
    }
}
