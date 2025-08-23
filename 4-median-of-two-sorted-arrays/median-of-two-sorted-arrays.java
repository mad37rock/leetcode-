class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int a=num1.length;
        int b=num2.length;
        int n=a+b;
        int [] arr=new int[n];
        int k=0;
        for(int i=0;i<a;i++){
            arr[k++]=num1[i];
        }   
          for(int i=0;i<b;i++){
            arr[k++]=num2[i];
        } 
        Arrays.sort(arr);
        int c=arr.length;
        if(c%2==1){
            return (double) arr[c/2];
        }else{
            int mid1=arr[c/2-1];
            int mid2=arr[c/2];
            return ((double)mid1+(double)mid2)/2.0;
        }    
    }
}