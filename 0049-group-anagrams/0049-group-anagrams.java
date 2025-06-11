class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        return getGroupAnagrams(strs);
    }

    public List<List<String>> getGroupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String sortString = sort(s);
            if (!map.containsKey(sortString)) {
                List<String> temp = new ArrayList<>();
                map.put(sortString, temp);
            }
            List<String> list = map.get(sortString);
            list.add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public String sort(String s) {
        int[] ch = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
                sb.append(ch[i]+" ");
        }
        return sb.toString();
    }
}
