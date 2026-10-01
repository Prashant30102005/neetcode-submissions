class Solution {
    List<List<String>> list = new ArrayList<>();
    public void backtrack(List<String> part,int start,String s){
        if(start==s.length()){
            list.add(new ArrayList<>(part));
            return;
        }
        for(int end = start;end<s.length();end++){
            if(isPal(s.substring(start,end+1))){
                part.add(s.substring(start,end+1));
                backtrack(part,end+1,s);
                part.remove(part.size()-1);
            }
        }
    }
    public boolean isPal(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        backtrack(new ArrayList<>(),0,s);
        return list;
    }
}
