class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                List<String>  list = map.get(s);
                list.add(strs[i]);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(s,temp);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        return list; 
    }
}