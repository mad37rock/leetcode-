class Solution {
    public String interpret(String command) {
        int n=command.length();
        // for(int i=0;i<n;i++){
        // }
        String s=command.replace("G","G").replace("()","o" ).replace( "(al)","al");
        return s;
        
    }
}