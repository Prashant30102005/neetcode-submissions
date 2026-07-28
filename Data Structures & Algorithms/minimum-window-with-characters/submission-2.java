class Solution {
    public static boolean isTrue( Map<Character,Integer> t, Map<Character,Integer>s){
        for(char c :t.keySet()){
            if(!s.containsKey(c)||s.get(c)<t.get(c))return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
       if(t.length()>s.length())return "";
       Map<Character,Integer> tm = new HashMap<>();
       Map<Character,Integer> sm = new HashMap<>();
       for(int i = 0;i<t.length();i++){
        tm.put(t.charAt(i),tm.getOrDefault(t.charAt(i),0)+1);
        sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
        }
        String res = ""; 
        if(isTrue(tm,sm))return s.substring(0,t.length());
        int j = 0;
        int i = t.length()-1;
        while(i<s.length()){
            if(i<s.length()){
                
                while(isTrue(tm,sm)){
                    if(res.equals("")||res.length()>i-j+1)res=s.substring(j,i+1);
                    
                    sm.put(s.charAt(j),sm.get(s.charAt(j))-1);
                    
                    j++;
                }
                i++;
                if(i==s.length())break;
                sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
                
            }
            else{
                break;
            }
        }
        return res;
    }
}
