class Solution {
    public boolean isSubsequence(String s, String t) {
        int p=s.length();
        int q=t.length();
        int i=0,j=0;
        while(i<p &&j<q){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
       return i==s.length();
    }
}