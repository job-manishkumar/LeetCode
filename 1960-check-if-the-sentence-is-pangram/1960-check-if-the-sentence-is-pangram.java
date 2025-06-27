class Solution {

    public boolean checkIfPangram(String sentence) {
        return getCheckIfPangram(sentence);
    }

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
}
