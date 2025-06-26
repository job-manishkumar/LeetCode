class Solution {

    public String[] divideString(String s, int k, char fill) {
        return getDivideString(s, k, fill);
    }

    //tc ->O(n) and sc -> O(n)
    public String[] getDivideString(String s, int k, char fill) {
        String[] arr = new String[(s.length() + k - 1) / k];
        int index = 0;
        for (int i = 0; i < s.length(); i = i + k) {
            arr[index] = s.substring(i, Math.min(k + i, s.length()));
            index++;
        }

        StringBuilder lastStr = new StringBuilder(arr[arr.length - 1]);
        if (lastStr.length() < k) {
            while (lastStr.length() < k) {
                lastStr.append(fill);
            }
            arr[arr.length - 1] = lastStr.toString();
        }
        return arr;
    }
}
