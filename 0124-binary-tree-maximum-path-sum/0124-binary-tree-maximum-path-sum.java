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
    private int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps(root);
        return maxsum;
        }
        private int mps(TreeNode root){
            if(root==null) return -1;
            int left=Math.max(0,mps(root.left));
            int right=Math.max(0,mps(root.right));
            int max=root.val+left+right;
            maxsum=Math.max(maxsum,max);
            return root.val+Math.max(left,right);
        }
    }