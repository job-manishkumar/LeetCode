class Solution {

    public boolean buddyStrings(String s, String goal) {
        return getBuddyStrings(s, goal);
    }

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
}
