class Solution {
    public String frequencyString(String str){
        int[] fre = new int[26];
        for(char c  : str.toCharArray()){
            fre[c-'a']++;
        }
        int a = 0;
        StringBuilder st = new StringBuilder();
        for(int i:fre){
            if(i>0){
                st.append((char)(a+'a'));
                st.append(i);
            }
            a++;
        }
        return st.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            String fs = frequencyString(s);
            if(!map.containsKey(fs)){
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(fs,ls);
            }
            else{
                map.get(fs).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
