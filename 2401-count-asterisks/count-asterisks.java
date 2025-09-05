class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int bars=0;
        int star=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                bars++;
            }
            if(s.charAt(i)=='*' & bars%2==0){
                star++;
            }
        }
        return star;
    }
}