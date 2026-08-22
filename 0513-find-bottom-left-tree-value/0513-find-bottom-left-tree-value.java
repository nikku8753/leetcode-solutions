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
    private int maxdepth=-1;
    private int value=0;
    public int findBottomLeftValue(TreeNode root) {
        left(root,0);
        return value;
    }
    private void left(TreeNode root,int cm){
        if(root==null){
            return ;

        }
        //if(root.left=null && root.right==null){
          //  return root.val;
        //}
        if(cm>maxdepth){
            maxdepth=cm;
            value=root.val;
        }
       // int left=left(root.left);
        //int right=left(root.right);

        left(root.left,cm+1);
        left(root.right,cm+1);

    }
}