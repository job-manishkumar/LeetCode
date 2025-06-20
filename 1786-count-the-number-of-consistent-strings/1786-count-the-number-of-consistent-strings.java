class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        return countStrings_2(allowed, words);
    }

    //approach 1
    //tc -> O(n(k² + k·log k + k·m))
    public int countStrings(String allowed, String[] words) {
        int count = 0;
        char[] ch = allowed.toCharArray();
        Arrays.sort(ch); //mlogm
        allowed = new String(ch);
        for (String word : words) { //n
            List<Character> list = new ArrayList<>();
            for (char c : word.toCharArray()) { //O(k2)
                if (!list.contains(c)) {
                    list.add(c);
                }
            }
            Collections.sort(list); //Ok(logk)
            if (list.size() <= ch.length) {
                boolean isEqual = true;
                for (char c : list) { //O(k*m)
                    if (allowed.indexOf(c) == -1) {
                        isEqual = false;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }
        return count;
    }

    //approach 2
    public int countStrings_2(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isConsist = true;
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    isConsist = false;
                }
            }
            if (isConsist) {
                count++;
            }
        }
        return count;
    }
}
