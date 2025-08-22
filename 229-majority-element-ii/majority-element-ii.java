class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        if(nums.length==0) return res;
        int n=nums.length;
        int first=Integer.MAX_VALUE;
        int firstsum=0;
        int second=Integer.MIN_VALUE;
        int secsum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==first){
                firstsum++;
            }
            else if(nums[i]==second){
                secsum++;
            }
            else if(firstsum==0){
                first=nums[i];
                firstsum=1;
            }
            else if(secsum==0){
                second=nums[i];
                secsum=1;
            }
            else{
                firstsum--;
                secsum--;
            }
        }
        firstsum=0;
        secsum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==first){
                firstsum++;
            }else if(nums[i]==second){
                secsum++;
            }
        }
        if(firstsum>n/3) res.add(first);
        if(secsum>n/3) res.add(second);
        return res;
        
    }
}