class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        List<Integer> li=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                li.add(nums[i]);
            }
        } 
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                li.add(0);
            }  
        }
        for(int i=0;i<n;i++){
            nums[i]=li.get(i);
        }
    }
}