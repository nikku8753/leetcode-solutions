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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls=new ArrayList<>();
        bst(root,ls);
        Collections.sort(ls);
        return ls.get(k-1);
    }
    private void bst(TreeNode root,List<Integer> ls){
        if(root==null) return;
        ls.add(root.val);
        bst(root.left,ls);
        bst(root.right,ls);
        return;
    }
}