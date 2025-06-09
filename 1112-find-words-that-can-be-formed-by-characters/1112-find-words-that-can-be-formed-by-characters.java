class Solution {

    public int countCharacters(String[] words, String chars) {
        return countChar(words, chars);
    }

    public int countChar(String[] words, String chars) {
        int count = 0;
        int[] ch = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            ch[chars.charAt(i) - 'a']++;
        }
        for (String s : words) {
            int[] ch2 = new int[26];
            boolean isPresent = true;
            for (int i = 0; i < s.length(); i++) {
                ch2[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ch2.length; i++) {
                if (ch2[i] > ch[i]) {
                    isPresent = false;
                    break;
                }
            }
           if(isPresent){
            count = count+s.length();
           }
        }
        return count;
    }
}
