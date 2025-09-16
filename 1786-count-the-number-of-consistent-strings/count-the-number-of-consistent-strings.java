class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            int j=0;
            for(;j<words[i].length();j++){
            char c=words[i].charAt(j);
                if(allowed.indexOf(c)==-1){
                    break;
                }
            }
            if(j==words[i].length()){
                count++;
            }
        }
            return count;
    }
}