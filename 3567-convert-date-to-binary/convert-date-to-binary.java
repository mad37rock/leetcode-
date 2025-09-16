class Solution {
    public String convertDateToBinary(String date) {
        String [] words=date.split("-");
        StringBuilder sb=new StringBuilder();
        int n=words.length;
        for(int i=0;i<n;i++){
                int bin=Integer.parseInt(words[i]);
                sb.append(Integer.toBinaryString(bin));
                if(i<n-1){
                    sb.append("-");
                }
        }
        return sb.toString();
        
    }
}