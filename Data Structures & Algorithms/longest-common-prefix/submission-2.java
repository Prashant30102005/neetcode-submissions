class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i = 1;i<strs.length;i++){
            int j = 0;
            while(j<s.length()&&j<strs[i].length()&&s.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            s = s.substring(0,j);
        }
        return s;
    }
}