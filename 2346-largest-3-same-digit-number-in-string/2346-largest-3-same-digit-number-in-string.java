class Solution {

    public String largestGoodInteger(String num) {
        return getLargeIntegerr(num);
    }

    //tc -> O(N) and sc -> O(1)
    public String getLargeIntegerr(String str) {
        char ans = '\0';
        char[] ch = str.toCharArray();
        for (int i = 1; i < ch.length - 1; i++) {
            if (ch[i] == ch[i - 1] && ch[i] == ch[i + 1]) {
                ans = (char)Math.max(ans, ch[i]);
            }
        }
        if(ans == '\0'){
            return "";
        }
        return new String(new char[]{ans,ans,ans});
    }
}
