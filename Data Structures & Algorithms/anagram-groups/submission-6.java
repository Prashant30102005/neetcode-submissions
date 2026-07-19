class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String str:strs){
            int[] c = new int[26];
            for(Character ch:str.toCharArray()){
                c[ch-'a']++;
            }
            List<String> tem = res.getOrDefault(Arrays.toString(c),new ArrayList<String>());
            tem.add(str);
            res.put(Arrays.toString(c),tem);
        }
        return new ArrayList<>(res.values());
    }
}
