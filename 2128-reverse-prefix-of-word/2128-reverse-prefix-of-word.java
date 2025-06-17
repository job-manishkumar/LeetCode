class Solution {

    public String reversePrefix(String word, char ch) {
        return getReversePrefix(word, ch);
    }

    public String getReversePrefix(String word, char ch) {
        if (word.indexOf(ch) != -1) {
            int index = word.indexOf(ch);
            return reverseString(word, 0, index);
        }
        return word;
    }

    public String reverseString(String word, int si, int ei) {
        char[] ch = word.toCharArray();
        int i = si;
        int j = ei;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
