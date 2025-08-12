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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li=new ArrayList<>();
        if(root==null) return li;
        if(root.left==null & root.right==null){
            li.add(Integer.toString(root.val));
            return li;
        }
        List <String> left=binaryTreePaths(root.left);
        for(int i=0;i<left.size();i++){
            li.add(root.val+"->"+left.get(i));
        }
        List <String> right=binaryTreePaths(root.right);
        for(int i=0;i<right.size();i++){
            li.add(root.val+"->"+right.get(i));
        }
        return li;        
    }
}