    class Solution {
        public boolean isMatch(String s, String p) {
            int n=s.length();
            int m=p.length();
            int i=0,j=0;
            int match=0;
            int index=-1;
            while(i<n){
                if(j<m && (p.charAt(j)=='?' || p.charAt(j)==s.charAt(i))){
                    i++;
                    j++;
                }else if(j<m && p.charAt(j)=='*'){
                    index=j;
                    match=i;
                    j++;
                }else if(index!=-1){
                    j=index+1;
                    match++;
                    i=match;
                }else{
                    return false;
                }
            }
            while(j<m && p.charAt(j)=='*'){
                j++;
            }
            return j==m;
            // String regex = p.replace("?", ".").replace("*", ".*");
            // return s.matches(regex); (run time error)

            // if(s==p) return true;
            // if(s.contains("*")||p.contains("*")) return true;
            // else return false; (no logic for ?)    
        }
    }