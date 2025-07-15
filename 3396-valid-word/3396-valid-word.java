class Solution {

    public boolean isValid(String word) {
        return getIsValid(word);
    }

    //approach 1
    //tc -> O(n) and sc -> O(1)
    public boolean getIsValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean isVowel = false;
        boolean isConsonent = false;
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
                if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
                    isVowel = true;
                } else {
                    isConsonent = true;
                }
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                continue;
            } else {
                return false;
            }
        }
        if (isVowel && isConsonent) {
            return true;
        }
        return false;
    }
}
