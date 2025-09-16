class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        // String [] words;
        for(int i=0;i<n;i++){
            // int j=0;
            // for(;j<words[i].length();j++){
            char c=s.charAt(i);
            int d='z'-c+1;
            sum=sum+(i+1)*d;
        }
        return sum;
    }
}