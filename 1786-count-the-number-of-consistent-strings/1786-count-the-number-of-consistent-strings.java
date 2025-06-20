class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        return countStrings_4(allowed, words);
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
    //tc -> (k* n* m) and sc - > O(1)
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

    //approach 3 using map
    //tc -> (n*m) and sc -> O(k)
    public int countStrings_3(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        for (String word : words) {
            boolean isConsist = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isConsist = false;
                    break;
                }
            }
            if (isConsist) {
                count++;
            }
        }
        return count;
    }

    //approach 4 using array
    public int countStrings_4(String allowed, String[] words) {
        int count = 0;
        int[] ch = new int[26];
        for (char c : allowed.toCharArray()) {
            ch[c - 'a']++;
        }
        for (String word : words) {
            boolean isConsist = true;
            for (char c : word.toCharArray()) {
                if (ch[c - 'a'] == 0) {
                    isConsist = false;
                    break;
                }
            }
            if (isConsist) {
                count++;
            }
        }
        return count;
    }
}
