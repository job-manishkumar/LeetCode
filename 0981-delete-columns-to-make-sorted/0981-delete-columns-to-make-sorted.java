class Solution {

    public int minDeletionSize(String[] strs) {
        return getMinDeletionSize(strs);
    }

    public int getMinDeletionSize(String[] strs) {
        int arrLen = strs.length;
        int strLen = strs[0].length();
        int count = 0;

        for (int j = 0; j < strLen; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrLen; i++) {
                sb = sb.append(strs[i].charAt(j));
            }
            count = count + isLexicographically(sb.toString());
        }
        return count;
    }

    public int isLexicographically(String s) {
        char c = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (c > s.charAt(i)) {
                count++;
                break;
            } else {
                c = s.charAt(i);
            }
        }
        return count;
    }
}
