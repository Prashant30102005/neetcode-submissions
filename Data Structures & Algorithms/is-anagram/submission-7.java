class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] cha = new int[26];
        for(int i = 0;i<s.length();i++){
            cha[s.charAt(i)-'a']++;
            cha[t.charAt(i)-'a']--;
        }
        for(int i:cha){
            if(i!=0)return false;
        }
        return true;
    }
}
