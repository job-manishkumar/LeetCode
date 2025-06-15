class Solution {

    public boolean makeEqual(String[] words) {
        return isEqual(words);
    }

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
}
