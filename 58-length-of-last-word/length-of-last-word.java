class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        s=s.trim();
        String[] word=s.split("\\s+");
        return word[word.length-1].length();
    }
}