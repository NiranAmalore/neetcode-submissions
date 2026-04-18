class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int arr[] = new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder keyB = new StringBuilder();
            for(int i:arr){
                keyB.append("#").append(i);
            }
            String key = keyB.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
