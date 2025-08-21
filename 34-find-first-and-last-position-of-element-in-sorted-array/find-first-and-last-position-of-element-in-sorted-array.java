class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int start=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(start==-1){
                    start=i;
                }last=i;
            }
        }
        return new int[]{start,last};
    }
}