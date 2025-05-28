class Solution {

    public boolean isValid(String s) {
        return isValidParentheses(s);
    }

    public boolean isValidParentheses(String s) {
        char[] st = new char[s.length()];
        int top = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st[top] = ch;
                top++;
            } else {
                if (top == 0) {
                    return false;
                }
                if (ch == ')' && st[top - 1] == '(' || ch == '}' && st[top - 1] == '{' || ch == ']' && st[top - 1] == '[') {
                    top--;
                } else {
                    return false;
                }
            }
        }
        if (top != 0) {
            return false;
        }
        return true;
    }
}
