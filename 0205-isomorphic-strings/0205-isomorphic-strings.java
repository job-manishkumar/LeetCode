class Solution {

    public boolean isIsomorphic(String s, String t) {
        return checkIsomorphic(s, t);
    }

    public boolean checkIsomorphic(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        if (ch1.length != ch2.length) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < ch1.length; i++) {
            if (map.containsKey(ch1[i])) {
                if (map.get(ch1[i]) != ch2[i]) {
                    return false;
                }
            } else {
                map.put(ch1[i], ch2[i]);
            }
        }
       // System.out.println(map);
        Set<Character> set = new HashSet<>();
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}
