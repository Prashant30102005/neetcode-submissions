class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] count = new int[26];
        int i = 0;
        while(i<s.length()){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
            i++;
        }
        for(int j : count){
            if(j!=0)return false;
        }
        return true;
    }
}
