package preparation.Graph;// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int root){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> visited = new ArrayList<Integer>();
        queue.add(root);
        visited.add(root);
        while(!queue.isEmpty()){
            int u = queue.pop();
            System.out.println(u);
            for(int i: adj[u]){
                if(!visited.contains(i)){
                    queue.add(i);
                    visited.add(i);
                }
            }
        }

    }

    public ArrayList<Integer> DFS(int root, ArrayList<Integer> visited, ArrayList<Integer> path){
        visited.add(root);
        System.out.println(root);
        path.add(root);
        for(int i: adj[root]){
            if(!visited.contains(i)){
                visited.add(i);
                DFS(i, visited, path);
            }
        }
        return path;
    }
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        ArrayList<Integer> visited = new ArrayList<Integer>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("*****BFS*****");
        g.BFS(0);
        System.out.println("*****DFS*****");
        path = g.DFS(2, visited,path);
        System.out.println("**PATHFINDER**");
        if(path.contains(3))
            System.out.println(true);
        else
            System.out.println(false);

    }
}