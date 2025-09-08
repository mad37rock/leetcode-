class Solution {
    public String frequencySort(String s) {
        int n= s.length();
        int[] freq=new int[128];
        StringBuilder sb=new StringBuilder();
        List<Character> li = new ArrayList<>();
        for (int i=0;i<n;i++) {
            char ch=s.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<128;i++) {
            if (freq[i]>0) {
                li.add((char) i);
            }
        }
        li.sort((a,b)->freq[b]-freq[a]);
        for (char c:li) {
            for (int i=0;i<freq[c];i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
