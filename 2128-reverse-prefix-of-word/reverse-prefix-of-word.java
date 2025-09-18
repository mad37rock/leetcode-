class Solution {
    public String reversePrefix(String word, char ch) {
        int cr=word.indexOf(ch);
        StringBuilder sb=new StringBuilder(word.substring(0,cr+1));
        sb.reverse();
        for(int i=cr+1;i<word.length();i++){
            char c=word.charAt(i);
            sb.append(c);
        }
        return sb.toString();


    }
}