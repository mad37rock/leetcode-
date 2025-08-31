class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int res=0;
        for(int i=0;i<n;i++){
             int temp=0;
            for(int j=0;j<accounts[i].length;j++){
                temp=temp+accounts[i][j];
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}