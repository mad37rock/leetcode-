class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int min=nums[i]-k;
            int max=nums[i]+k;
            if(last<min){
                last=min;
                count++;
            }else if(last<max){
                last=last+1;
                count++;
            }
        }
        return count;
        
    }
}