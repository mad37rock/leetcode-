class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int count=0;
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            right=right+nums[i];
        }
        for(int i=0;i<n;i++){
            right=right-nums[i];
            if(nums[i]==0){
              if(left==right){
                count=count+2;
              }else if(Math.abs(left-right)==1) {
                count++;
              }
            }
            left=left+nums[i];
        }
        return count;
    }
}