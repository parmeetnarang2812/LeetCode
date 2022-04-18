/*                         897. Increasing Order Search Tree - Easy
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, 
and every node has no left child and only one right child.

Example 1:
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

Example 2:
Input: root = [5,1,7]
Output: [1,null,5,null,7]

Constraints:
The number of nodes in the given tree will be in the range [1, 100].
0 <= Node.val <= 1000 
*/

/* my leetcode soln
    
    Optimised Approach: Time Complexity - O(n), Space Complexity - O(h)

class Solution {
    private TreeNode curr = new TreeNode(0);
    
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = curr;
        inorder(root);
        return ans.right;
    }
    
    public void inorder(TreeNode node) {
        if(node==null) {
            return;
        }
        
        inorder(node.left);
        
        curr.right = node;
        node.left = null;
        curr = node;
        
        inorder(node.right);
    }
} 
*/

/* 
Brute Force Approach : Time Complexity - O(n), Space Complexity - O(n)

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        List<TreeNode> traversal = new ArrayList<>();
        inorder(root, traversal);
        reorder(traversal);
        return traversal.get(0);
    }
    
    public void inorder(TreeNode root, List<TreeNode> traversal){
        if(root != null){
            inorder(root.left, traversal);
            traversal.add(root);
            inorder(root.right, traversal);
        }
    }
    
    public void reorder(List<TreeNode> traversal){
        for(int i=0; i<=traversal.size()-1; i++){
            TreeNode current = traversal.get(i);
            current.left = null;
            if(i<traversal.size()-1){
                current.right = traversal.get(i+1);
            }
        }
    }
} 
*/