class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    count=count+Math.abs(i-j);
                }
            }
            arr[i]=count;
        }
     return arr;
    }
}