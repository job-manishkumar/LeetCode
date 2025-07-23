class Solution {
    List<String> list = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        return getRestoreIpAddresses(s);
    }

    public List<String> getRestoreIpAddresses(String s) {
        if (s.length() > 12 || s.length() < 4) {
            return list;
        }
        getCorrectIps(s, 0, 0, "");
        return list;
    }

    public void getCorrectIps(String s, int index, int part, String curr) {
        //base condition
        if (index == s.length() && part == 4) {
            list.add(curr.substring(0,curr.length()-1));
            return;
        }
        if (index + 1 <= s.length()) {
            getCorrectIps(s, index + 1, part + 1, curr + s.substring(index, index + 1) + ".");
        }
        if (index + 2 <= s.length() && isValid(s.substring(index, index + 2))) {
            getCorrectIps(s, index + 2, part + 1, curr + s.substring(index, index + 2) + ".");
        }
        if (index + 3 <= s.length() && isValid(s.substring(index, index + 3))) {
            getCorrectIps(s, index + 3, part + 1, curr + s.substring(index, index + 3) + ".");
        }
    }

    public boolean isValid(String str) {
        if (str.charAt(0) == '0') {
            return false;
        } else if (Integer.parseInt(str) > 255) {
            return false;
        }
        return true;
    }
}
