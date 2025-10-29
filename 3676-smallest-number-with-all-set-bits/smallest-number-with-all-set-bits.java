class Solution {
    public int smallestNumber(int n) {
        int len=Integer.toBinaryString(n).length();
        int res=(1<<len)-1;
        return res;
    }
}