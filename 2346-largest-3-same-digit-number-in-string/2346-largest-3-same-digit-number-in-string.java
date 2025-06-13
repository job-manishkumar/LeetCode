class Solution {

    public String largestGoodInteger(String num) {
        return getLargeIntegerr(num);
    }

    public String getLargeIntegerr(String str) {
        int ans = -1;
        char[] ch = str.toCharArray();
        for (int i = 1; i < ch.length - 1; i++) {
            if (ch[i] == ch[i - 1] && ch[i] == ch[i + 1]) {
                ans = Math.max(ans, ch[i] - '0');
            }
        }
        if(ans ==-1){
            return "";
        }
        String maxString = ans + "" + ans + "" + ans;
        return maxString;
    }
}
