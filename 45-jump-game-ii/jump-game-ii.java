class Solution {
    public int jump(int[] nums) {
        int mini=0;
        int index=0;
        int jumps=0;
        int n=nums.length;
        if(index>+n-1) return jumps;
        for(int i=0;i<n-1;i++){
            mini=Math.max(mini,i+nums[i]);
            if(i==index){
                jumps++;
                index=mini;
            }
        }
        return jumps;
    }
}