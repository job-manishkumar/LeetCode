class Solution {

    public String longestCommonPrefix(String[] strs) {
        return getLongestCommonPrefix(strs);
    }

    // Tc -> O(n*minLen)
    public String getLongestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            if (min > s.length()) {
                min = s.length();
            }
        }
        String currString = strs[0].substring(0, min);
       // System.out.println(currString);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currString.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (currString.charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(currString.charAt(i));
        }
        return sb.toString();
    }
}
