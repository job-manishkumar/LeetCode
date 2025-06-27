class Solution {

    public boolean checkIfPangram(String sentence) {
        return getCheckIfPangram_2(sentence);
    }

    //aproach 1 -- using char array
    //tc -> O(n) and sc -> O(1)
    public boolean getCheckIfPangram(String str) {
        int[] ch = new int[26];
        for (char c : str.toCharArray()) {
            ch[c - 'a']++;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                return false;
            }
        }
        return true;
    }

    //appraoch 2
    public boolean getCheckIfPangram_2(String str) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        for (int i = 0; i < letters.length; i++) {
            if (str.indexOf(letters[i]) == -1) {
                return false;
            }
        }
        return true;
    }
}
