class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int count =0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' && count++>0) sb.append(c);
            if(c==')' && count-->1) sb.append(c);
        }
       return sb.toString(); 
    }
}