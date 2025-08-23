class Solution {
    public String multiply(String num1, String num2) {
        int a=num1.length();
        int b=num2.length();
        int [] res=new int[a+b];
        StringBuilder sb=new StringBuilder();
        if(num1.equals("0")|| num2.equals("0")) return "0";
        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int i1=i+j;
                int i2=i+j+1;
                int sum=mul+res[i2];
                res[i1]=res[i1]+sum/10;
                res[i2]=sum%10;
            }
        }
        for(int i=0;i<res.length;i++){
            int p=res[i];
            if(sb.length()==0 && p==0){
                continue;
            }
            sb.append(p);
        }

        if(sb.length()==0){
            return "0";
        }
        else{
            return sb.toString();
        }



        
    }
}