class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int ud=0;
        int lr=0;
        for(int i=0;i<n;i++){
            char c=moves.charAt(i);
            if(c=='U')ud++;
            if(c=='D')ud--;
            if(c=='R')lr++;
            if(c=='L')lr--;
        }
        return ud==0 &&lr==0;
    }
}