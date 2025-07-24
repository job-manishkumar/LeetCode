class Solution {

    public boolean buddyStrings(String s, String goal) {
        return getBuddyStrings_2(s, goal);
    }

    //approach 1
    //tc -> O(n) and sc - > O(n)
    public boolean getBuddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        //case 1
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    return true;
                }
                set.add(c);
            }
            return false;
        }
        //case two
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        if (list.size() == 2) {
            int i = list.get(0);
            int j = list.get(1);
            return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
        }
        return false;
    }

    //apporoach 2
    //tc -> O(n) and sc - > O(1)
    public boolean getBuddyStrings_2(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        //case 1
        if (s.equals(goal)) {
            int[] ch = new int[26];
            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != 0 && ch[i] != 1) {
                    return true;
                }
            }
            return false;
        }
        //case 2
        int[] ch = new int[2];
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (count <= 2) {
                    ch[index++] = i;
                } else {
                    return false;
                }
            }
        }
        int i = ch[0];
        int j = ch[1];
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
}
