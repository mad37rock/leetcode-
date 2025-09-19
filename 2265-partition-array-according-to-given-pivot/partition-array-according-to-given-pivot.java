class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int [] res=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[c++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                res[c++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                res[c++]=nums[i];
            }
        }
        return res;
    }
}