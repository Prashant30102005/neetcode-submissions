class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str :strs){
            int[] cha = new int[26];
            for(char c:str.toCharArray()){
                cha[c-'a']++;
            }

            List<String> list =map.get(Arrays.toString(cha));
            if(list==null){
                list = new ArrayList<>();
            }
            list.add(str);
            map.put(Arrays.toString(cha), list);
        }
        return new ArrayList<>(map.values());
    }
}
