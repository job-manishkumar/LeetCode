class Solution {

    public boolean checkIfPangram(String sentence) {
        return getCheckIfPangram(sentence);
    }

    public boolean getCheckIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            if (sentence.indexOf(alphabets.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
