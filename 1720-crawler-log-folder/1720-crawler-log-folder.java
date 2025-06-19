class Solution {

    public int minOperations(String[] logs) {
        return countMinOperations(logs);
    }

    public int countMinOperations(String[] logs) {
        int top = 0;
        for (String s : logs) {
            if (s.equals("../")) {
                if (top > 0) {
                    top--;
                }
            } else if (!s.equals("./")) {
                top++;
            }
        }
        return top;
    }
}
