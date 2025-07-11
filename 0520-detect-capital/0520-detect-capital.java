class Solution {

    public boolean detectCapitalUse(String word) {
        return getDetectCapitalUse(word);
    }

    public boolean getDetectCapitalUse(String word) {
        if (countCaptical(word) == word.length() || countCaptical(word) == 0 || (countCaptical(word) == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            return true;
        }
        return false;
    }

    public int countCaptical(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
