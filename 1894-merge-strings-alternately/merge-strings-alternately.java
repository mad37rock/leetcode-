class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<a && j<b){
            char s1=word1.charAt(i);
            char s2=word2.charAt(j);
            sb.append(s1);
            sb.append(s2);
            i++;j++;
        }
        while(i<a){
            char s1=word1.charAt(i);
            sb.append(s1);
            i++;
        }
            while(j<b){
            char s2=word2.charAt(j);
            sb.append(s2);
            j++;
        }
        return sb.toString();
        
    }
}