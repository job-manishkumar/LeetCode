class Solution {

    public String maximumOddBinaryNumber(String s) {
        return maxOddBinary(s);
    }

    //approach 1
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
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < count; i++) {
            ch[i] = '1';
        }
        return new String(ch);
    }
}
