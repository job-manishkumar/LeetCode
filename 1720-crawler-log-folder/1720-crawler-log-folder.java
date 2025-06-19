class Solution {
    public int minOperations(String[] logs) {
        return countMinOperations(logs);
    }

    public int countMinOperations(String[] logs){
        String[] st = new String[logs.length];
        int top=0;
        for(String s:logs){
            if(s.equals("../") && top > 0){
                top--;
            }
            else if(!s.equals("./") && !s.equals("../")){
                st[top] = s;
                top++;
            }
        }
        return top;
    }
}