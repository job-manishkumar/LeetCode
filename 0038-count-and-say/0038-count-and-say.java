class Solution {

    public String countAndSay(int n) {
        return getCountAndSay(n);
    }
//approach 1
    //tc ->O(n*m) and sc -> O(n)
    public String getCountAndSay(int n) {
        //base condition
        if (n == 1) {
            return "1";
        }
        String say = getCountAndSay(n - 1);
        return countSay(say);
    }

    public String countSay(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        char curr_char = ch[0];
        int curr_count = 1;
        for (int j = 1; j < ch.length; j++) {
            if (ch[j] == curr_char) {
                curr_count++;
            } else {
                sb.append(curr_count).append(curr_char);
                curr_char = ch[j];
                curr_count = 1;
            }
        }
        sb.append(curr_count).append(curr_char);
        return sb.toString();
    }
}
