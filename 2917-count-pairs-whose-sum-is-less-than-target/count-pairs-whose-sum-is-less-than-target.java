class Solution {
    public int countPairs(List<Integer>numsList, int target) {
        int n = numsList.size();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = numsList.get(i);
        }
        Arrays.sort(nums);
        int l=0,r=n-1;
        int count=0;
        while(l<r){
            if(nums[l]+nums[r]<target){
                count=count+r-l;
                l++;
            }else{
                r--;
            }
        }
        return count;
    }
}