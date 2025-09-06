class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*(n+1);
        int sumeven=n*n;
        return gcd(sumodd,sumeven);
         
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}