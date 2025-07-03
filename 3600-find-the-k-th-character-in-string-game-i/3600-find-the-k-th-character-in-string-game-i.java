class Solution {

    public char kthCharacter(int k) {
        return getKthCharacter(k, "a");
    }

    //approach 1
    public char getKthCharacter(int k, String word) {
        char[] c = word.toCharArray();
        if (c.length >= k) {
            return word.charAt(k - 1);
        }
        int size = c.length;
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            sb.append((char) ((value - 'a' + 1) % 26 + 'a'));
        }
        word = word.concat(sb.toString());
        return getKthCharacter(k, word);
    }
}
