class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        return getGroupAnagrams(strs);
    }

    public List<List<String>> getGroupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortString = new String(ch);
            if(!map.containsKey(sortString)){
                List<String> temp = new ArrayList<>();
                map.put(sortString,temp);
            }
            List<String> list = map.get(sortString);
            list.add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
