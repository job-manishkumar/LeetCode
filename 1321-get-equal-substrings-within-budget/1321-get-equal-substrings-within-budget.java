class Solution {

    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int cost = 0;
        int maxLength = 0;
        for(int r = 0;r<s.length();r++){
            cost = cost+ Math.abs(s.charAt(r)-t.charAt(r));
            if(cost<=maxCost){
                maxLength = Math.max(maxLength,r-l+1);
            }
            else{
                cost = cost - Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
        }
        return maxLength;
    }
}

//abcd - 1 
//a- b =>1
//b-> c =>1
//c->d => 1
//d-e => 1;
//e-f=>
