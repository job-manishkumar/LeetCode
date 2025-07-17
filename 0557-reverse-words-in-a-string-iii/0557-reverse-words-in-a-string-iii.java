class Solution {

    public String reverseWords(String s) {
        return getReverseWords(s);
    }

    //approach 1
    public String getReverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) {
            sb = sb.append(reverse(str)).append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }

    public String reverse(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }
}
