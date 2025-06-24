class Solution {

    public int minimumRecolors(String blocks, int k) {
        return getMinimumRecolors(blocks, k);
    }

    //approach 1 - using fix size slinding window
    public int getMinimumRecolors(String blocks, int k) {
        int min = blocks.length();
        char[] ch = blocks.toCharArray();
        int si = 0;
        int ei = k - 1;
        while (ei < ch.length) {
            int count = 0;
            for (int i = si; i <= ei; i++) {
                if (ch[i] == 'W') {
                    count++;
                }
            }
            min = Math.min(min, count);
            si++;
            ei++;
        }
        return min;
    }
}
