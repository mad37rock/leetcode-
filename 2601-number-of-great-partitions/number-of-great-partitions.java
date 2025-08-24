class Solution {
    public int countPartitions(int[] nums, int k) {
        final int mod=1_000_000_007;
        long ans=1,total=0;
        long[] dp=new long[k];
        dp[0]=1;
        for(int j=0;j<nums.length;j++){
            int x=nums[j];
            ans=2*ans%mod;
            total=total+x;
            for(int i=k-1-x;i>=0;--i){
                dp[i+x]=(dp[i]+dp[i+x])% mod;
            }
        }
        ans=ans-2*LongStream.of(dp).sum();
        if( total>=2*k){
                return (int)((ans%mod+mod)%mod);
            }else{
                return 0;
            }
        
    }
}