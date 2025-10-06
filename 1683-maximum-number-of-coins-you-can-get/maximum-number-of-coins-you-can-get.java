class Solution {
    public int maxCoins(int[] p) {
        int n=p.length;
        Arrays.sort(p);
        int total=0;
        int pair=n/3;
        for(int i=pair;i<n;i+=2){
            total=total+p[i];
        }
        return total;
    }
}