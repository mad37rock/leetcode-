class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String [] word=text.split(" ");
        int n=word.length;
        int count=0;
        for(int i=0;i<n;i++){
            int j=0;
            for(;j<word[i].length();j++){
                char c=word[i].charAt(j);
                // boolean notbro=true;
                if(brokenLetters.indexOf(c)!=-1){
                    break;
                }
            }
                if(j==word[i].length()){
                    count++;
                }
        }
        return count;
    }
}