class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n=words.length;
        List<String> li=new ArrayList<>();
        li.add(words[0]);
        for(int i=1;i<n;i++){
            if(!isAnagram(words[i],words[i-1])){
                li.add(words[i]);
            }
        }
        return li;
    }
     private boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}