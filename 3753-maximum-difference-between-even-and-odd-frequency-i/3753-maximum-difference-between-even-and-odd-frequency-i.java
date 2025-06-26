class Solution {

    public int maxDifference(String s) {
        return getMaxDifference(s);
    }

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
}
