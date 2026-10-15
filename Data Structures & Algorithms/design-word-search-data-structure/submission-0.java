class TrieNode{
    TrieNode[] nodes = new TrieNode[26];
    boolean endOfWord;
}
class WordDictionary {
    public TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(char c:word.toCharArray()){
            int indx = c-'a';
            if(curr.nodes[indx]==null){
                curr.nodes[indx] = new TrieNode();
            }
            curr = curr.nodes[indx];
        }
        curr.endOfWord = true;
    }

    public boolean search(String word) {
        return recur(root,word,0);
    }
    public boolean recur(TrieNode root,String word,int j){
        TrieNode cur = root;
        for(int i = j;i<word.length();i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(TrieNode child:cur.nodes){
                    if(child!=null&&recur(child,word,i+1)){
                        return true;
                    }
                }
                return false;
            }else{
                if(cur.nodes[c-'a']==null){
                    return false;
                }
                cur = cur.nodes[c-'a'];
            }
        }
        return cur.endOfWord;
    }
}
