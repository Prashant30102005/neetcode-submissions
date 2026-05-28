class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] alpha = new int[26];
            for(char c:str.toCharArray()){
                alpha[c-'a']++;
            }
            String count = Arrays.toString(alpha);
            map.putIfAbsent(count,new ArrayList<>());
            map.get(count).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
