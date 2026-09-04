class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int n = s.length();
        int[] alpha = new int[26];
        for(int i = 0;i<n;i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int i:alpha){
            if(i!=0)return false;
        }
        return true;
    }
}
