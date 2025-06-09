class Solution {

    public String largestGoodInteger(String num) {
        return getGoodInteger(num);
    }

    public String getGoodInteger(String num) {
        int maxChar = -1;
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                maxChar = Math.max(maxChar, num.charAt(i) - '0');
            }
        }

        if(maxChar == -1){
            return new String();
        }
        String s = String.valueOf(maxChar)+maxChar+maxChar;
        return s;
    }
}
