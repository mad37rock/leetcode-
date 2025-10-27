class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int k=nums[i];
            int sum=0;
            while(k>0){
                sum=sum+k%10;
                k=k/10;
            }
            if(sum<min) min=sum;
        }
        return min;
    }
}