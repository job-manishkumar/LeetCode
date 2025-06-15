class Solution {

    public int minOperations(String s) {
        return countOperation(s);
    }

    public int countOperation(String s) {
        int count1 = 0;
        int count2 = 0;
        char[] ch1 = s.toCharArray();
        for (int i = 1; i < ch1.length; i++) {
            if (ch1[i] == ch1[i - 1]) {
                ch1[i] = (char) (((ch1[i] - '0') ^ 1) + '0');
                count1++;
            }
        }
        char[] ch2 = s.toCharArray();
        ch2[0] = (char) (((ch2[0] - '0') ^ 1) + '0');
        count2 = 1;
        for (int i = 1; i < ch2.length; i++) {
            if (ch2[i] == ch2[i - 1]) {
                ch2[i] = (char) (((ch2[i] - '0') ^ 1) + '0');
                count2++;
            }
        }

        return Math.min(count1, count2);
    }
}
