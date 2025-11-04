class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int m=order.length;
        int[] res=new int[n];
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(friends[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(order[i])){
                res[count++]=order[i];
            }
        }
        return res;
    }
}