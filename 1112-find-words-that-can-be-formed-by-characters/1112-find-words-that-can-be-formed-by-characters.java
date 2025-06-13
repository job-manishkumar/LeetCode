class Solution {

    public int countCharacters(String[] words, String chars) {
        return countLength(words, chars);
    }

    public int countLength(String[] words, String chars) {
        int totalLength = 0;
        int[] ch1 = new int[26];
        for (char c : chars.toCharArray()) {
            ch1[c - 'a']++;
        }
        for (String word : words) {
            int[] ch2 = new int[26];
            for (char c2 : word.toCharArray()) {
                ch2[c2 - 'a']++;
            }
            if (isPresent(ch1, ch2)) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    public boolean isPresent(int[] ch1, int[] ch2) {
        for (int i = 0; i < ch1.length; i++) {
            if (ch2[i] > ch1[i]) {
                return false;
            }
        }
        return true;
    }
}
