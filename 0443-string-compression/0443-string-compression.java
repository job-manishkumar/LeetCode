class Solution {

    public int compress(char[] chars) {
        return getCompress(chars);
    }

    //apporach 1 using two pointer
    public int getCompress(char[] ch) {
        char curr_char = ch[0];
        int i = 0;

        int index = 0;
        while (i < ch.length) {
            curr_char = ch[i];
            int countCurr_Char = 0;
            while (i < ch.length && ch[i] == curr_char) {
                i++;
                countCurr_Char++;
            }
            ch[index] = curr_char;
            index++;
            if (countCurr_Char > 1) {
                for (char c : String.valueOf(countCurr_Char).toCharArray()) {
                    ch[index] = c;
                    index++;
                }
            }
        }
        return index;
    }
}
