class Solution {
    int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String intToRoman(int num) {
        return getIntToRoman(num);
    }

    public String getIntToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 13 && num > 0; i++) {
            int times = num / number[i];
            if (times > 0) {
                for (int j = 0; j < times; j++) {
                    sb = sb.append(symbol[i]);
                }
                num = num % number[i];
            }
        }
        return sb.toString();
    }
}
