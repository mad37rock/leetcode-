class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int b=s.length();
        LinkedList<String> ar=new LinkedList<>(); 
        String[] word=s.split("\\s+");
        for(int i=0;i<word.length;i++){
            ar.addFirst(word[i]);
        }
        return String.join(" ",ar);
    }
}