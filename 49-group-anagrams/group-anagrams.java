class Solution {
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> mapValues = new LinkedList<List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for (int i = 0; i < strs.length; ++i) {
            String s = strs[i];
            String key = toKey(s);
            map.computeIfAbsent(key, k -> {
                List<String> group = new LinkedList<>();
                mapValues.add(group);
                return group;
            }).add(s);
        }
        return mapValues;
    }

    private String toKey(String s) {
        char[] arr = new char[26];
        for (int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
        }
        return String.valueOf(arr);
    }
}