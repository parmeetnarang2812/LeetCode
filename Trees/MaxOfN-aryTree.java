/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


//  LeetCode Solution 
/*
class Solution {
    public int maxDepth(Node root) {
        //base case
        if (root == null) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (Node child : root.children) {
         max = Math.max(max, maxDepth(child));       //recursion
        }

        return Math.max(0, max) + 1;
    }
}
*/