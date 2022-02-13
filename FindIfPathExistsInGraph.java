/* class Solution {
    static class Edge{
        int src;
        int nbr;
        
        Edge(int src, int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
        // making array of ArrayList of Edge
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i = 0; i<n;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        
        // filling the array with the edges
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            Edge e1 = new Edge(v1,v2);
            Edge e2 = new Edge(v2,v1);
            graph[v1].add(e1);
            graph[v2].add(e2);
        }
        
        
        // making an array of boolean to check whether the neighbour is visited or not
        boolean visited[] = new boolean[n];
        return hasPath(graph, start, end, visited);
        
    }
    
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        // first mark the source visited
        visited[src] = true;
        if(src==dest){
            return true;
        }
        
        for(Edge e: graph[src]){
            // we will only go to that neighbour which is not visited
            if(!visited[e.nbr]){
                boolean validPath = hasPath(graph, e.nbr, dest, visited);
                if(validPath){
                    return true;
                }
            }
        }
        
        //if we get here it means there is no way to the dest from any neighbour so
        // there is no way from source also
        
        return false;
    }

} */