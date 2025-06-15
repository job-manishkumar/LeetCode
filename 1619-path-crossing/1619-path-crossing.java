class Solution {

    public boolean isPathCrossing(String path) {
        return isCrossed(path);
    }

    public boolean isCrossed(String str) {
        Set<String> set = new HashSet<>();
        set.add("0,0");
        int xAxis = 0;
        int yAxis = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'N') {
                yAxis++;
            } else if (ch == 'E') {
                xAxis++;
            } else if (ch == 'S') {
                yAxis--;
            } else {
                xAxis--;
            }
            String s = xAxis + "," + yAxis;
            if (set.contains(s)) {
                return true;
            }
            set.add(new String(s));
        }
        return false;
    }
}
