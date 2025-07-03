class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return getArrayStringsAreEqual(word1, word2);
    }

    public boolean getArrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for (String s : word1) {
            str1 = str1.concat(s);
        }
        for (String s : word2) {
            str2 = str2.concat(s);
        }
        return str1.equals(str2);
    }
}
