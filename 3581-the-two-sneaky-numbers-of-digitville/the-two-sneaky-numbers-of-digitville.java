class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        int [] arr=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                arr[count]=nums[i];
                count++;
                while (i<n-1&&nums[i]==nums[i+1]) {
                    i++;
                }
            }
        }
        int[] result=new int[count];
        for(int i=0;i<count;i++) {
            result[i]=arr[i];
        }
        return result;
    }
}