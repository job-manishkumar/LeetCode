class Solution {

    public String orderlyQueue(String s, int k) {
        return getOrderlyQueue(s, k);
    }
//approach 1
//tc -> O(n2) and sc -> O(n)
    public String getOrderlyQueue(String s, int k) {
        char[] ch = s.toCharArray();
        String ans = s;
        if (k == 1) {
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(ans) < 0) {
                    ans = rotated;
                }
            }
            return ans;
        }
        Arrays.sort(ch);
        return new String(ch);
    }
}
