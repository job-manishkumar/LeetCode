class Solution {

    public String addStrings(String num1, String num2) {
        return addTwoStrings(num1, num2);
    }

    public String addTwoStrings(String num1, String num2) {
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int p1 = ch1.length - 1;
        int p2 = ch2.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (p1 >= 0 || p2 >= 0 || carry > 0) {
            int n1 = (p1>=0)?ch1[p1] - '0':0;
            int n2 = (p2>=0)?ch2[p2] - '0':0;
            int sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            sb.append(sum);
            p1--;
            p2--;
        }

        return sb.reverse().toString();
    }
}
