class Solution {

    public String makeFancyString(String s) {
        return getFancyString(s);
    }

    public String getFancyString(String s) {
        if(s.length()<3){
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
}
