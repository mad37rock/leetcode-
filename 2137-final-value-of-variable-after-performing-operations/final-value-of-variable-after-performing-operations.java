class Solution {
    public int finalValueAfterOperations(String[] op) {
        int n=op.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(op[i].equals("++X") || op[i].equals("X++")){
                res++;
            }else{
                res--;
            }
        }
        return res;
    }
}