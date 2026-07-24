class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int total = 0;
        int res = 0;
        int j = 0;
        for(int i = 0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                res--;
            }
            set.add(s.charAt(i));
            res++;
            total = Math.max(res,total);
        }
        return total;
    }
}
