class Solution {

    public int maxScore(String s) {
        return getMaxScore_2(s);
    }

    //approach 1 - using prefix and suffix sum
    //tc -> O(n) and sc -> O(n)
    public int getMaxScore(String s) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        char[] ch = s.toCharArray();
        //calculate pf for zero from left to right
        int[] pf = new int[ch.length];
        if (ch[0] - '0' == 0) {
            pf[0] = 1;
        }
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] - '0' == 0) {
                pf[i] = pf[i - 1] + 1;
            } else {
                pf[i] = pf[i - 1];
            }
        }
        System.out.println(Arrays.toString(pf));

        //calculate suffix for one from right to left
        int[] sf = new int[ch.length];
        if (ch[ch.length - 1] - '0' == 1) {
            sf[sf.length - 1] = 1;
        }
        for (int i = sf.length - 2; i >= 0; i--) {
            if (ch[i] - '0' == 1) {
                sf[i] = sf[i + 1] + 1;
            } else {
                sf[i] = sf[i + 1];
            }
        }
        System.out.println(Arrays.toString(sf));
        for (int i = 1; i < ch.length; i++) {
            count = pf[i - 1] + sf[i];
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    //approach 2
    public int getMaxScore_2(String s) {
        int totalOne = 0;
        for (char c : s.toCharArray()) {
            if (c - '0' == 1) {
                totalOne++;
            }
        }
        char[] ch = s.toCharArray();
        int countZero = 0;
        int total = 0;
        int max = 0;
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] - '0' == 0) {
                countZero++;
            } else {
                totalOne--;
            }
            max = Math.max(max,countZero+totalOne);
        }
        return max;
    }
}
