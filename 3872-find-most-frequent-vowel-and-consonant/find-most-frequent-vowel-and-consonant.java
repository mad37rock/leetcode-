class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int maxv=0;
        int maxc=0;
        int [] freq=new int[26];
        String vow="aeiou";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            if(vow.indexOf(c)!=-1){
                maxv=Math.max(maxv,freq[c-'a']);
            }else{
                maxc=Math.max(maxc,freq[c-'a']);
            }
        }
        return maxc+maxv;
    }
}