class Solution {

    public int findComplement(int num) {
        return getComplement(num);
    }

    public int getComplement(int num) {
        int n = 0;
        int setBit = 0;
        for (int i = 31; i >= 0; i--) {
            if (((num >> i) & 1) == 1) {
                setBit = i;
                break;
            }
        }
        for (int i = 0; i <= setBit; i++) {
            num = num ^ (1 << i);
        }
        return num;
    }
}
