class Solution {
    public String addBinary(String a, String b) {
        int x=a.length()-1;
        int y=b.length()-1;
        int carry=0;
        StringBuilder sc=new StringBuilder();
        while(x>=0 ||y>=0){

            int sum=carry;
            if(x>=0) sum=sum+a.charAt(x--)-'0';
            if(y>=0) sum=sum+b.charAt(y--)-'0';
            if(sum>1){
                carry=1;
            }else{
                carry=0;
            }
            sc.append(sum%2);
        }
        if(carry!=0){
            sc.append(carry);
        }
        return sc.reverse().toString();
    }
}