class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(candyType[i]);
        }
        return Math.min(s.size(),n/2);
    }
}