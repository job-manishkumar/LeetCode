class Solution {

    public String countAndSay(int n) {
        return getCountAndSay(n);
    }

    public String getCountAndSay(int n) {
        //base condition
        if (n == 1) {
            return "1";
        }
        String prev = getCountAndSay(n - 1);
        return getCount(prev);
    }

    public String getCount(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count).append(str.charAt(i));
        return sb.toString();
    }
}
