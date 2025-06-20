class Solution {

    public int minLength(String s) {
        return getMinLength(s);
    }

    public int getMinLength(String s) {
        char[] st = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if ((c == 'B' || c == 'D') && top > 0) {
                char lastChar = st[top - 1];
                if (lastChar == 'A' && c == 'B') {
                    top = top - 1;
                } else if (lastChar == 'C' && c == 'D') {
                    top = top - 1;
                } else {
                    st[top] = c;
                    top++;
                }
            } else {
                st[top] = c;
                top++;
            }
        }
        return top;
    }
}
