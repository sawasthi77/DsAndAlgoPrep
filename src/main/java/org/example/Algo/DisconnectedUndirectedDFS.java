package org.example.Algo;

import java.util.ArrayList;
import java.util.List;

public class DisconnectedUndirectedDFS {
    static void addEdge(List<List<Integer>> adj, int s, int t){
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    static void DFSRec(List<List<Integer>> adj, boolean[] visited, int s){
        visited[s] = true;
        System.out.print(s + " ");

        for(int i: adj.get(s)){
            if(!visited[i]){
                DFSRec(adj, visited, i);
            }
        }
    }

    static void DFS(List<List<Integer>> adj, int v){
        boolean[] visited = new boolean[v];

        for(int i = 0; i< v; i++){
            if(!visited[i]){
                DFSRec(adj, visited, i);
            }
        }
    }

    public static void main(String[] args){
        int V = 6;

        // Create an adjacency list for the graph
        List<List<Integer> > adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define the edges of the graph
        int[][] edges
                = { { 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };

        // Populate the adjacency list with edges
        for (int[] edge : edges) {
            addEdge(adj, edge[0], edge[1]);
        }

        System.out.println("Complete DFS of the graph:");
        DFS(adj, V);
    }
}
