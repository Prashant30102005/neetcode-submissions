class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                k = Math.max(k,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return k;
    }
}
