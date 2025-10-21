class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0,dsum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            while(nums[i]!=0){
                dsum=dsum+nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return sum-dsum;
    }
}