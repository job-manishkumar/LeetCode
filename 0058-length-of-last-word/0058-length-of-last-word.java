class Solution {
    public int lengthOfLastWord(String s) {
        return getLengthOfLastWord(s);
    }

    public int getLengthOfLastWord(String s) {
        String[] str = s.split(" ");
       return str[str.length-1].trim().length();
        
    }
}