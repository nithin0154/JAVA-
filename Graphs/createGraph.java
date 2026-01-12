package Graphs;
import java.util.*;


public class createGraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int d,int w){
            this.src = src;
            this.dest=d;
            this.wt = w;
        }
    }
    public static void create(ArrayList<Edge>[] graph, int V){
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }
        // 0 - node
        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0, 2, 1));
        
        // 1 - node
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1 ,3, 1));

        // 2 - node
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 - node
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4- node
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5 - node
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 - node
        graph[6].add(new Edge(6, 5, 1));

    }
    //BFS using Queue
    public static void BFS(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited  = new boolean[graph.length];
        
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                 System.out.print(curr+" ");
                 visited[curr]=true;
                 for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                 }
            }
        }
    }
    //DFS using recursion
    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        //visit
        System.out.print(curr+" ");
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[] ){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create(graph, V);
        // BFS(graph);
        // System.out.println();
        // DFS(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 8, new boolean[V]));
    }
}
