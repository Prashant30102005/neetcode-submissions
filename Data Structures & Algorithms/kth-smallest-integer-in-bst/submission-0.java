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
    List<Integer> list = new ArrayList<>();
    public void backtrack(TreeNode root){
        if(root==null)return;
        backtrack(root.left);
        list.add(root.val);
        backtrack(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        backtrack(root);
        return list.get(k-1);
    }
}
