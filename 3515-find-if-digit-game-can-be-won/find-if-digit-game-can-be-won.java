class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                count=count+nums[i];
            }else{
                count1=count1+nums[i];
            }
        }
        if(count==count1){
            return false;
        }else{
            return true;
        }
        
    }
}