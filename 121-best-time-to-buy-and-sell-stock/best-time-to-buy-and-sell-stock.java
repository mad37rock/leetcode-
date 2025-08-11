class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
            }
        return max;
    }
}