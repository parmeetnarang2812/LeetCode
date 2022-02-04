/**                 101. Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode node1, TreeNode node2) {
        //base case 1
        if (node1 == null && node2 == null) {
            return true;
        }
        //base case 2
        if (node1 == null || node2 == null) {
            return false;
        }
        //base case 3
        if (node1.val != node2.val) {
            return false;
        }

        //  check next layer
        //         node1                     node2
        // node1.left  node2.right   node1.left   node2.right
        
        return helper(node1.left, node2.right) && helper(node1.right, node2.left);
    }
}
*/