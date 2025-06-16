class Solution {

    public String maximumOddBinaryNumber(String s) {
        return maxOddBinary_2(s);
    }

    //approach 1
    //tc -> O(n) and sc -> O(n)
    public String maxOddBinary(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') == 1) {
                count++;
            }
        }
        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = '0';
        }
        ch[ch.length - 1] = '1';
        count = count - 1;
        for (int i = 0; i < count; i++) {
            ch[i] = '1';
        }
        return new String(ch);
    }

    //approach 2- using two pointer
    public String maxOddBinary_2(String s) {
        int nz = 0;
        int z = 0;
        char[] c = s.toCharArray();
        while (nz < c.length) {
            if (c[nz] == '1') {
                //swap ch[nz] and ch[z];
                char temp = c[nz];
                c[nz] = c[z];
                c[z] = temp;
                z++;
            }
            nz++;
        }

        int index = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == '1') {
                index = i;
                break;
            }
        }
        //swap ch[ch.length-1] and ch[index];
        char temp = c[c.length - 1];
        c[c.length - 1] = c[index];
        c[index] = temp;
        return new String(c);
    }
}
