class Solution {
    public String longestCommonPrefix(String[] s) {
        int n=s.length;
        String prefix=s[0];
        for(int i=1;i<n;i++){
            while(s[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}