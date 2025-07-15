class Solution {

    public boolean closeStrings(String word1, String word2) {
        return getCloseStrings(word1, word2);
    }

    public boolean getCloseStrings(String word1, String word2) {
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        boolean charValue = true;
        boolean charFreq = true;
        for (int i = 0; i < word1.length(); i++) {
            ch1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            ch2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((ch1[i] != 0 && ch2[i] == 0) || (ch1[i] == 0 && ch2[i] != 0)) {
                charValue = false;
                break;
            }
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < 26; i++) {
            if (ch1[i] != ch2[i]) {
                charFreq = false;
                break;
            }
        }
        return charValue && charFreq;
    }
}
