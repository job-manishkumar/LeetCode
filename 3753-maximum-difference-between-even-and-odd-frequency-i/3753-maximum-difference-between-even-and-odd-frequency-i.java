class Solution {

    public int maxDifference(String s) {
        return getMaxDifference_2(s);
    }

    //approach 1 -using map
    //tc -> O(n) and sc -> O(n)
    public int getMaxDifference(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (maxOdd < entry.getValue()) {
                    maxOdd = entry.getValue();
                }
            } else {
                if (minEven > entry.getValue()) {
                    minEven = entry.getValue();
                }
            }
        }
        return maxOdd - minEven;
    }

    //approach 2
    //tc -> O(n) and sc -> O(1)
    public int getMaxDifference_2(String s) {
        int[] ch = new int[26];
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            ch[c[i] - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] % 2 != 0) {
                if (max < ch[i]) {
                    max = ch[i];
                }
            } else if (ch[i] % 2 == 0 && ch[i] != 0) {
                if (min > ch[i]) {
                    min = ch[i];
                }
            }
        }
        return max - min;
    }
}
