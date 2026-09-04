class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] alpha = new int[26];
            for(char c :str.toCharArray()){
                alpha[c-'a']++;
            }
            String temp = Arrays.toString(alpha);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            List<String> t = map.get(temp);
            t.add(str);
            map.put(temp,t);
        }
        return new ArrayList<>(map.values());
    }
}
