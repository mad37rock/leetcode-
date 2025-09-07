class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        int [] map1=new int[150];
        int [] map2=new int[150];
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map1[c1]!=map2[c2]){
                return false;
            }
            map1[c1]=i+1;
            map2[c2]=i+1;
        }
        return true;
    }
}