class Solution {
        private Map <String,Boolean> mp=new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        if(m!=n){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        String key=s1+" "+s2;
        if(mp.containsKey(key)) return mp.get(key);
        for(int i=1;i<n;i++){
            boolean withoutswap=isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i));
            if(withoutswap){
                mp.put(key,true);
                return true;
            }
            boolean withswap=isScramble(s1.substring(0,i),s2.substring(n-i)) && isScramble(s1.substring(i),s2.substring(0,n-i));
            if(withswap){
                mp.put(key,true);
                return true;
            }
        }
        mp.put(key,false);
        return false;
    }
}