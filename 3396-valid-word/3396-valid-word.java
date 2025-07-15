class Solution {

    public boolean isValid(String word) {
        return getIsValid_2(word);
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

    //approach 2 - using in build class in java
    public boolean getIsValid_2(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean isVowel = false;
        boolean isConsonent = false;
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                if (isVowel(ch[i])) {
                    isVowel = true;
                } else {
                    isConsonent = true;
                }
            } else if (Character.isDigit(ch[i])) {
                continue;
            } else {
                return false;
            }
        }
        if (isVowel & isConsonent) {
            return true;
        }
        return false;
    }

    public boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
