/**
* Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph. 
* Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.

Example 1:
Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
Output: [[2,4],[1,3],[2,4],[1,3]]
Explanation: There are 4 nodes in the graph.
1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).

Example 2:
Input: adjList = [[]]
Output: [[]]
Explanation: Note that the input contains one empty list. The graph consists of only one node with val = 1 and it does not have any neighbors.

Example 3:
Input: adjList = []
Output: []
Explanation: This an empty graph, it does not have any nodes.
 

Constraints:
The number of nodes in the graph is in the range [0, 100].
1 <= Node.val <= 100
Node.val is unique for each node.
There are no repeated edges and no self-loops in the graph.
The Graph is connected and all nodes can be visited starting from the given node.

Note:
* The number of nodes will be between 1 and 100.
* The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
* Since the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.
* You must return the copy of the given node as a reference to the cloned graph.
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {}
    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

/*  my leetcode soln
class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> copied = new HashMap<>();
        return dfs(node, copied);
    }

    // this method will reture the copy node of original node
    public Node dfs(Node node, Map<Node, Node> copied) {
        
        if (node == null) {
            return null;    //return null if node is null
        }

        if (copied.containsKey(node)) {
            return copied.get(node);    // if map already has the details of the node, then return the Node corresponding to the key.
        }

        
        Node copyNode = new Node(node.val); // create the new node(copyNode) with the value
        copied.put(node, copyNode);  // put the new node into the map

        // iterate through neighbour list of the given node and add them recursively to the neighbour list of the newly created 'copyNode'
        for (Node neighbor : node.neighbors) {
            copyNode.neighbors.add(dfs(neighbor, copied));
        }

        return copyNode;    //return this new node
    
    }
} 
*/