class Solution {
    public String intToRoman(int num) {
        int [] integers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String r="";

        for(int i=0;i<integers.length;i++){
            while(num>= integers[i]){
                r=r+symbol[i];
                num=num-integers[i];
            }
        }
        return r;
    }
}