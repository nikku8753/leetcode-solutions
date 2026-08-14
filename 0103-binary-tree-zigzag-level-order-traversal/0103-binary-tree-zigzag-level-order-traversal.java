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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> ls=new ArrayList<>();
     zgz(root,ls,0);
     return ls;    
    }
    private void zgz(TreeNode root,List<List<Integer>> ls,int level){
        if(root==null) return;
        if(level==ls.size()){
            ls.add(new LinkedList<>());
        }
        if(level%2==0){
            ls.get(level).add(root.val);
        }
        else 
        ls.get(level).add(0,root.val);
        zgz(root.left,ls,level+1);
        zgz(root.right,ls,level+1);
    }
}