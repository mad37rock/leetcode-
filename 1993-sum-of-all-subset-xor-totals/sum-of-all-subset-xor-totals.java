class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total=total|nums[i];
        }
        return total*(1<<(n-1));
        
    }
}