class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int water=0;
        int l=0,r=n-1;;
        int lmax=height[l];
        int rmax=height[r];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                water=water+lmax-height[l];
            }else{
                r--;
                rmax=Math.max(rmax,height[r]);
                water=water+rmax-height[r];
            }
        }
        return water;
    }
}