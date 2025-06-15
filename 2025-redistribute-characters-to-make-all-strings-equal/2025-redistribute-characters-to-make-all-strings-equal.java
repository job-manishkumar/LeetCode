class Solution {

    public boolean makeEqual(String[] words) {
        return isEqual_2(words);
    }

    //apprach 1 - using map
      //tc -> O(n*l) and sc - > O(n)
    public boolean isEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % words.length != 0) {
                return false;
            }
        }
        return true;
    }

    //approach 2 - using char array
    //tc -> O(n*l) and sc - > O(1)
    public boolean isEqual_2(String[] words) {
        int[] ch = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                ch[c - 'a']++;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
