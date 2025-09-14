class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
        int count=0;
        for(int i=0;i<m;i++){
             char c=stones.charAt(i);
            if(jewels.indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
}