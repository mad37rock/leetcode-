class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String [] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            res.append(sb.reverse());
            if(i<words.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}