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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ls=new ArrayList<>();
        dfs(root,targetSum,0,ls,new ArrayList<>());
        return ls;
    }
    private void dfs(TreeNode root,int target,int currsum,List<List<Integer>> ls,List<Integer> curr ){
        if(root==null) return;
        currsum+=root.val;
        curr.add(root.val);
        if(root.left==null && root.right==null && currsum==target){
            ls.add(new ArrayList<>(curr));}
            dfs(root.left,target,currsum,ls,curr);
            dfs(root.right,target,currsum,ls,curr);
            curr.remove(curr.size()-1);
        }
    
}