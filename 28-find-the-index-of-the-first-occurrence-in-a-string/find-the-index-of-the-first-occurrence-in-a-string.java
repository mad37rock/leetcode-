class Solution {
    public int strStr(String haystack, String needle) {
        int p=haystack.length();
        int q=needle.length();
        if(q>p) return -1;
        if(haystack.equals(needle)) return 0;
        for(int i=0;i<=p-q;i++){
            if(haystack.substring(i,i+q).equals(needle)) return i;
        }
        return -1;
    }
}