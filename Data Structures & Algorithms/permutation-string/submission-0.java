class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        Map<Character,Integer> h1 = new HashMap<>();
        Map<Character,Integer> h2 = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
            h2.put(s2.charAt(i),h2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(h1.equals(h2))return true;
        int left = 0;
        for(int right= s1.length();right<s2.length();right++){
            h2.put(s2.charAt(right),h2.getOrDefault(s2.charAt(right),0)+1);
            h2.put(s2.charAt(left),h2.get(s2.charAt(left))-1);
            if(h2.get(s2.charAt(left))==0){
                h2.remove(s2.charAt(left));
            }
            if(h1.equals(h2))return true;
            left++;
        }
        return false;
    }
}
