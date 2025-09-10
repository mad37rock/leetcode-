class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int res=0;
        int count=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='L') count=count+1;
            else count=count-1;
            if(count==0) res++;
        }
        return res;
    }
}