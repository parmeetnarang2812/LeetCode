/**                 100. Same Tree
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
// Time: O(N)
// Space: O(height)

/*
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base case 1
        if (p == null && q == null) {
            return true;
        }
        // base case 2
        if (p == null || q == null) {
            return false;
        }
        // base case 3
        if (p.val != q.val) {
            return false;
        }

        // if current node is the same, continue to compare the next level
        // check next layer and compare each position
        // one two
        // one.left one.right two.left two.right
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
*/