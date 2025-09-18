class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=0,r=x;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            long square=(long)mid*mid;
            if(square==x) return mid;
            else if(square<x) l=mid+1;
            else r=mid-1;
        }
        return r;
    }
}