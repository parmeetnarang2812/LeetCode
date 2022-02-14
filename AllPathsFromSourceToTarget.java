/*                  797. All Paths From Source to Target - Medium

Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).

 
Example 1:
Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.

Example 2:
Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 

Constraints:
n == graph.length
2 <= n <= 15
0 <= graph[i][j] < n
graph[i][j] != i (i.e., there will be no self-loops).
All the elements of graph[i] are unique.
The input graph is guaranteed to be a DAG.

*/

/*  my leetcode soln 

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        List<Integer> individual = new ArrayList<>();
        sourceToTarget(graph, visited, 0, n - 1, individual);
        return res;
    }

    public void sourceToTarget(int[][] graph, boolean[] visited, int src, int dest, List<Integer> individual) {
        if (src == dest) {
            individual.add(src);
            ArrayList<Integer> newAL = new ArrayList<>();
            newAL.addAll(individual);
            res.add(newAL);
            individual.remove(individual.size() - 1);
            return;
        }

        if (visited[src]) {
            return;
        }

        visited[src] = true;
        individual.add(src);

        for (Integer nbr : graph[src]) {
            if (!visited[nbr]) {
                sourceToTarget(graph, visited, nbr, dest, individual);
            }
        }

        visited[src] = false;
        individual.remove(individual.size() - 1);   //Backtracking : Remove the recently added vertex.
    }
}
*/

/*  for better understanding 

class Solution {

    // basic DFS traversal while keeping track of current path; remove current node
    // from visited set once all its neighbors are visited
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        findPaths(graph, 0, allPaths, new ArrayList<>(), visited);
        return allPaths;
    }

    public void findPaths(int[][] graph, int curNode, List<List<Integer>> allPaths, List<Integer> curPath,
            boolean[] visited) {
        if (curNode == graph.length - 1) { // base case; reached destination node
            List<Integer> completePath = new ArrayList<Integer>(curPath);
            completePath.add(curNode);
            allPaths.add(completePath); // add complete path to response list
            return;
        }
        curPath.add(curNode);
        visited[curNode] = true;
        for (int neighbor : graph[curNode]) {
            if (!visited[neighbor]) {
                findPaths(graph, neighbor, allPaths, curPath, visited);
            }
        }
        curPath.remove(curPath.size() - 1); // while backtracking from current node in recursion, remove it from current
                                            // path
        visited[curNode] = false; // while backtracking from current node in recursion, mark it as unvisited so
                                  // that other paths can use this node again if required (we will for sure never
                                  // traverse exact same path)
    }
} 
*/