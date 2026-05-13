class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i = 0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res +=s.charAt(i);
            }
        }
        res = res.toLowerCase();
        int i = 0;
        int j = res.length()-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
