class Solution {
    public int hammingWeight(int n) {
        int one_bits=0;
        while(n!=0){
            n=n &(n-1);
            one_bits++;
        }
        return one_bits;
    }
}