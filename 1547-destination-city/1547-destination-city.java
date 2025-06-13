class Solution {

    public String destCity(List<List<String>> paths) {
        return getDestinationCity(paths);
    }

    public String getDestinationCity(List<List<String>> paths) {
        Set<String> source = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            source.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            if (!source.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}
