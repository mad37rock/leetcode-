class Solution {
    public int mostWordsFound(String[] s) {
        int n=s.length;
        int max=0;
        for(int i=0;i<n;i++){
            String [] arr=s[i].split(" ");
            if(arr.length>max){
            max=arr.length;                
            }
        }
        return max;
    }
}