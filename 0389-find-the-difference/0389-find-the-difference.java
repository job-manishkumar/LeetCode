class Solution {

    public char findTheDifference(String s, String t) {
        return findDiff3(s, t);
    }

    public char findDiff(String s, String t) {
        //apporach tc -> O(n) and sc -> O(1)
        int[] ch = new int[26];
        for (int i = 0; i < t.length(); i++) {
            ch[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return '\0';
    }

    public char findDiff2(String s, String t) {
        //apporach tc -> O(n) and sc -> O(1)
        int[] ch = new int[26];
        int sumS = 0;
        int sumT = 0;
        for (int i = 0; i < s.length(); i++) {
            sumS = sumS + s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sumT = sumT + t.charAt(i);
        }
        return (char)(sumT - sumS);
    }

    public char findDiff3(String s,String t){
        int ans = 0;
        for(int i=0;i<s.length();i++){
            ans = ans ^ s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            ans = ans ^ t.charAt(i);
        }
        return (char)ans;
    }

}
