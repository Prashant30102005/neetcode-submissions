public class TrieNode{
    TrieNode[] nodes = new TrieNode[26];
    boolean isEnd; 
}
class PrefixTree {
    private TrieNode root;
    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            if(cur.nodes[c-'a']==null){
                cur.nodes[c-'a'] = new TrieNode();
            }
            cur = cur.nodes[c-'a'];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            if(cur.nodes[c-'a']==null){
                return false;
            }
            cur = cur.nodes[c-'a'];
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(char c : prefix.toCharArray()){
            if(cur.nodes[c-'a']==null){
                return false;
            }
            cur = cur.nodes[c-'a'];
        }
        return true;
    }
}
