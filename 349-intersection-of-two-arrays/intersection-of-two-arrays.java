class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    if(li.contains(nums1[i])==false){
                        li.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int [] res=new int[li.size()];
        for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;
    }
}