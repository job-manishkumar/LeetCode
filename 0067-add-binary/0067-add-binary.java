class Solution {

    public String addBinary(String a, String b) {
        return addTwoBinary(a, b);
    }

    public String addTwoBinary(String str1, String str2) {
        int carry = 0;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int p1 = ch1.length - 1;
        int p2 = ch2.length - 1;
        StringBuilder sb = new StringBuilder();
        while (p1 >= 0 || p2 >= 0 || carry > 0) {
            if (p1 < 0) {
                p1 = 0;
                ch1[p1] = '0';
            }
            if (p2 < 0) {
                p2 = 0;
                ch2[p2] = '0';
            }
            int num1 = ch1[p1] - '0';
            int num2 = ch2[p2] - '0';
            int sum = (num1 + num2 + carry) % 2;
            carry = (num1 + num2 + carry) / 2;
            sb.append(sum);
            p1--;
            p2--;
        }
        return sb.reverse().toString();
    }
}
