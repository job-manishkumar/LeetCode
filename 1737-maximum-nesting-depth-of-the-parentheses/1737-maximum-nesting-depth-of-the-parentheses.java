class Solution {
    public int maxDepth(String s) {
        return getMaxDepth(s);
    }

    public int getMaxDepth(String s){
        int[] st = new int[s.length()];
        int top = 0;
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(s.charAt(i) =='('){
                    st[top] = s.charAt(i);
                    top++;
                }
                else{
                    maxLength = Math.max(maxLength,top);
                    top--;
                }
            }
        }
        return maxLength;

    }
}