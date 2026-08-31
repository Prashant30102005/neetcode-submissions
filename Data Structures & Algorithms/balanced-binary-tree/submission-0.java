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
    public int height(TreeNode root){
        if(root==null)return 0;
        int count = 1;
        count += Math.max(height(root.left),height(root.right));
        return count;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        boolean isBalance;
        if(height(root.left)-height(root.right)<=1&&height(root.left)-height(root.right)>=-1)isBalance = true;
        else{
            isBalance = false;
        }
        return isBalance&&isBalanced(root.left)&&isBalanced(root.right);
    }
}
