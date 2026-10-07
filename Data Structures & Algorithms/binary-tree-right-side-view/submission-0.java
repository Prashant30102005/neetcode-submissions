/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    Map<Integer,List<Integer>> map = new HashMap<>();
    public void backtrack(TreeNode root,int i){
        if(root == null)return;
        if(!map.containsKey(i)){
            map.put(i,new ArrayList<>());
        }
        List<Integer> list = map.get(i);
        list.add(root.val);
        map.put(i,list);
        backtrack(root.left,i+1);
        backtrack(root.right,i+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        backtrack(root,0);
        List<Integer> lis = new ArrayList<>();
        for(List<Integer> list:map.values()){
            lis.add(list.get(list.size()-1));
        }
        return lis;
    }
}
