class Solution {

    public String reverseVowels(String s) {
        return reverse(s);
    }

    public String reverse(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (!isVowels(ch[i])) {
                i++;
            } else if (!isVowels(ch[j])) {
                j--;
            } else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }

    public boolean isVowels(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
