class Solution {

    public void reverseString(char[] s) {
        reverse(s);
    }

    public void reverse(char[] ch) {
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
