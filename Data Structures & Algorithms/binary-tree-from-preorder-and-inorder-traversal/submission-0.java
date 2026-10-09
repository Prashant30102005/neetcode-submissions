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
    int preIndx = 0;
    public int search(int[] in,int val){
        for(int i = 0;i<in.length;i++){
            if(in[i]==val)return i;
        }
        return -1;
    }
    public TreeNode construct(int[] pre,int[] in,int l,int r){
        if(l>r)return null;
        TreeNode root = new TreeNode(pre[preIndx]);
        int indx = search(in,pre[preIndx]);
        preIndx++;
        root.left = construct(pre,in,l,indx-1);
        root.right = construct(pre,in,indx+1,r);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,inorder,0,inorder.length-1);
    }
}
