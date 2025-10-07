class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            res=Math.max(res,nums[i]+nums[n-i-1]);
        }
        return res;
        
    }
}