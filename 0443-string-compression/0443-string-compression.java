class Solution {

    public int compress(char[] chars) {
        return getCompress(chars);
    }

    //approach 1
    public int getCompress(char[] chars) {
        int i = 0;
        char curr_char = chars[0];
        int currcharCount = 1;
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] == curr_char) {
                currcharCount++;
            } else {
                chars[i++] = curr_char;
                if (currcharCount > 1) {
                    for (char ch : String.valueOf(currcharCount).toCharArray()) {
                        chars[i++] = ch;
                    }
                }
                curr_char = chars[j];
                currcharCount = 1;
            }
        }
        chars[i++] = curr_char;
        if (currcharCount > 1) {
            for (char ch : String.valueOf(currcharCount).toCharArray()) {
                chars[i++] = ch;
            }
        }
        return i;
    }
}
