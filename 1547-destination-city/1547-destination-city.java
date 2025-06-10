class Solution {
    public String destCity(List<List<String>> paths) {
        return getDestinationCity(paths);
    }

    public String getDestinationCity(List<List<String>> path){
        Set<String> set = new HashSet<>();
        for(int i=0;i<path.size();i++){//O(n)
            String source = path.get(i).get(0);
            set.add(source);
        }
        for(int i=0;i<path.size();i++){//O(n)
            String destination = path.get(i).get(1);
            if(!set.contains(destination)){
                return destination;
            }
        }
        return "";

    }
}