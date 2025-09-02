class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        String vowel="AaEeIiOoUu";
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk=new Stack<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(vowel.indexOf(c)!=-1){
                stk.push(c);
            }
        }
         for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(vowel.indexOf(c)!=-1){
                sb.append(stk.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}