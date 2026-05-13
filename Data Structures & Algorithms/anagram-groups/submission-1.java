class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
            for(char i:s.toCharArray()){
                count[i-'a']++;
            }
            String str = Arrays.toString(count);
            if(!res.containsKey(str)){
                res.put(str,new ArrayList<>());
            }
            res.get(str).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
