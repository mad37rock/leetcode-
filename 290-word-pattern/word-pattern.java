class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        int m=s.length();
        String [] words=s.split(" ");
        if(words.length!=n) return false;
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch).equals(words[i])==false)
                    return false;
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(ch,words[i]);
            }
        }
        return true;
    }
}