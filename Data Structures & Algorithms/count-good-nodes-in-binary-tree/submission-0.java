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
    int i = 0;
    public void count(TreeNode root,int min){
        if(root==null)return ;
        if(root.val>=min){
            i++;
            min = root.val;
        }
        count(root.left,min);
        count(root.right,min);
    }
    public int goodNodes(TreeNode root) {
        count(root,-101);
        return i;
    }
}
