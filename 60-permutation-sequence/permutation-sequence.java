class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> li=new ArrayList<>();
        String seq="";
        for(int i=1;i<n;i++){
            fact=fact*i;
            li.add(i);
        }   
        li.add(n);
        k=k-1;
        while(true){
            seq=seq+li.get(k/fact);
            li.remove(k/fact);
            if(li.size()==0) break;
            k=k%fact;
            fact=fact/li.size();
        }
        return seq;
    }
}