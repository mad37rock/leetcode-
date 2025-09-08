class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        List<int[]> li=new ArrayList<>();
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                li.add(new int[]{nums[i-1],count});
                count=1;
            }
        }
        li.add(new int[]{nums[n-1],count});
        li.sort((a,b)-> b[1]-a[1]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=li.get(i)[0];
        }
       return res; 
    }
}