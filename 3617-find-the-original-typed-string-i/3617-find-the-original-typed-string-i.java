class Solution {

    public int possibleStringCount(String word) {
        return getPossibleStringCount(word);
    }

    public int getPossibleStringCount(String str) {
        int totalCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                totalCount = totalCount + 1;
            }
        }
        return totalCount;
    }
}
