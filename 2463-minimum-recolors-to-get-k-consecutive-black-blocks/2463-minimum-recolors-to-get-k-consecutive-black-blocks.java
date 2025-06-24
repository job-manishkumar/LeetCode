class Solution {

    public int minimumRecolors(String blocks, int k) {
        return getMinimumRecolors_2(blocks, k);
    }

    //approach 1 - using fix size slinding window
    //tc -> O(n*l) and sc -> O(1)
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

    //approach 2
    public int getMinimumRecolors_2(String blocks, int k) {
        char[] ch = blocks.toCharArray();
        int l = 0;
        int r = 0;
        int count = 0;
        int min = ch.length;
        while (r < ch.length) {
            if (ch[r] == 'W') {
                count++;
            }
            if (r - l + 1 == k) {
                min = Math.min(min, count);
                if (ch[l] == 'W') {
                    count--;
                }
                l++;
            }
            r++;
        }
        return min;
    }
}
