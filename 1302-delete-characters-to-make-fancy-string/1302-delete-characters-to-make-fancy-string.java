class Solution {

    public String makeFancyString(String s) {
        return getFancyString_2(s);
    }

    //approach 1
    //tc -> O(n) and sc O(1)
    public String getFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        char[] ch = s.toCharArray();
        int i = 0;
        int j = 1;
        int k = 2;
        StringBuilder sb = new StringBuilder();
        while (k < ch.length) {
            if (!(ch[i] == ch[j] && ch[j] == ch[k])) {
                sb.append(ch[i]);
            }
            i++;
            j++;
            k++;
        }
        sb = sb.append(ch[i]).append(ch[j]);
        return sb.toString();
    }

    //approach 2 -using stack
    public String getFancyString_2(String s) {
        if (s.length() < 3) {
            return s;
        }
        char[] st = new char[s.length()];
        char[] ch = s.toCharArray();
        int top = 0;
        for (int i = 0; i < ch.length; i++) {
            if (top >= 2) {
                char c1 = st[top - 1];
                char c2 = st[top - 2];
                if (!(ch[i] == c1 && ch[i] == c2)) {
                    st[top] = ch[i];
                    top++;
                }
            } else {
                st[top] = ch[i];
                top++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<top;i++){
            sb.append(st[i]);
        }
        return sb.toString();
    }
}
