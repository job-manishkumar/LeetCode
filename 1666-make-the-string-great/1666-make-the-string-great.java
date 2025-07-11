class Solution {

    public String makeGood(String s) {
        return getMakeGood(s);
    }

//approach 1 using stack
//tc -> O(n) and sc -> O(n)
    public String getMakeGood(String s) {
        char[] st = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if (top > 0) {
                if (c >= 'A' && c <= 'Z') {
                    if (st[top - 1] >= c + 32 && st[top - 1] <= c + 32) {
                        top--;
                    } else {
                        st[top] = c;
                        top++;
                    }
                } else if (c >= 'a' && c <= 'z') {
                    if (st[top - 1] >= c - 32 && st[top - 1] <= c - 32) {
                        top--;
                    } else {
                        st[top] = c;
                        top++;
                    }
                }
            } else {
                st[top] = c;
                top++;
            }
        }
        char[] c = new char[top];
        for (int i = 0; i < c.length; i++) {
            c[i] = st[i];
        }
        return new String(c);
    }
}
