class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int [] freq=new int[101];
        int max=0,res=0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max) max=freq[i];
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max) res=res+freq[i];

        }
        return res;
    }
}