class Solution {

    public boolean wordPattern(String pattern, String s) {
        return checkWordPattern(pattern, s);
    }

    public boolean checkWordPattern(String pattern, String str) {
        String[] s = str.split("\\s");
        char[] ch = pattern.toCharArray();
        if (ch.length != s.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                String value = map.get(ch[i]);
                if (!value.equals(s[i])) {
                    return false;
                }
            } else {
                map.put(ch[i], s[i]);
            }
        }
        Set<String> set = new HashSet<>();
		for(Map.Entry<Character,String> entry:map.entrySet()){
			if(set.contains(entry.getValue())){
				return false;
			}
			set.add(entry.getValue());
		}
        return true;
    }
}
