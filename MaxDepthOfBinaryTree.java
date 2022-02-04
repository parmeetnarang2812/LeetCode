/**                 104. Maximum Depth of Binary Tree
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


    //LeetCode Solution
/* 
class Solution {
    public int maxDepth(TreeNode root) {
        // //base case
        // if(root == null) {
        // return 0;
        // }
        // return Math.max(maxDepth(root.left), maxDepth(root.right))+1;        //recursion

        // one line code
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
*/