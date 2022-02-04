/**                 236. Lowest Common Ancestor of a Binary Tree
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * 
 * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *                        3
 *                  /           \
 *                  5           1
 *               /     \   /        \
 *              6       2  0        8
 *                     / \
 *                    7   4
 * Example 1:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * 
 * Example 2:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

/*  leetcode solution 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // ask for values from left and right child
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // check condtion and determine what to return to upper level
        if (left != null && right != null) { // found LCA
            return root;
        }

        // going bottom-up now.
        // If the left is null or the right is null, then return their alternate. --
        // This is the overlapping condition where x is the LCA of y or vice-versa.

        // left == null && right == null OR left == null && right != null
        // if left == null -> return right
        // no matter right == null OR right == TreeNode p/q
        return left == null ? right : left;

        // return (left == null ? right : (right == null) ? left : root);   //this will handle negative cases also i.e when both p and q is not there in the tree
    }
}
*/