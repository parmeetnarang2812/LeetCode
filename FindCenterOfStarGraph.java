/*                      1791. Find Center of Star Graph - Easy

There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

Example 1:
Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.

Example 2:
Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
 
Constraints:
3 <= n <= 105
edges.length == n - 1
edges[i].length == 2
1 <= ui, vi <= n
ui != vi
The given edges represent a valid star graph. 
*/


/*  Time - O(1), Space - O(N)
public int findCenter(int[][] edges) {
	if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
		return edges[0][0];
	} else {
		return edges[0][1];
	}

    // one liner
    //return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
} 
*/

/* 
Explanation
The center of the graph which needs to be there in every edge array.
So we make use of that simple observation.
We consider first edge and the center could be either first or second element.
we check if first element is equal to either first or second of next edge, if so edges[0][0] is our center otherwise edges[0][1]. 
*/