class Solution {

    public int strStr(String haystack, String needle) {
        return findFirstOccorrence(haystack, needle);
    }

    public int findFirstOccorrence(String str1, String str2) {
        return str1.indexOf(str2);
    }
}
