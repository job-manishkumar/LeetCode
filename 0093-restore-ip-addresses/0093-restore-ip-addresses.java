class Solution {
    List<String> list = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        return getRestoreIpAddresses(s);
    }

    //approach 1
    //tc -> O(3N) and sc ->O(1)
    public List<String> getRestoreIpAddresses(String s) {
        if (s.length() > 12 || s.length() < 4) {
            return list;
        }
        getCorrectIps(s, 0, 0, "");
        return list;
    }

    public void getCorrectIps(String s, int index, int parts, String curr) {
        //base condition
        if (index == s.length() && parts == 4) {
            list.add(curr.substring(0, curr.length() - 1));
            return;
        }

        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String part = s.substring(index, index + i);
            if (isValid(part)) {
                getCorrectIps(s, index + i, parts + 1, curr + s.substring(index, index + i) + ".");
            }
        }
    }

    public boolean isValid(String str) {
        if (str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == '0') {
            return false;
        } else if (Integer.parseInt(str) > 255) {
            return false;
        }
        return true;
    }
}
