package org.example.Algo;

import java.util.ArrayList;
import java.util.List;

public class UndirectedDepthFirstSearch {
    static void DFSRec(List<List<Integer>> adjList, boolean[] visited, int s){
        visited[s] = true;

        System.out.print(s + " ");

        for(int i : adjList.get(s)){
            if(!visited[i]){
                DFSRec(adjList, visited, i);
            }
        }
    }

    static void DFS(List<List<Integer>> adjList, int s){
        boolean[] visited = new boolean[adjList.size()];

        DFSRec(adjList, visited, s);
    }

    static void addEdge(List<List<Integer>> adj, int s, int t){
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        int[][] edges = {{1,2},{1,0},{2,0},{2,3},{2,4}};

        for(int[]e:edges){
            addEdge(adj, e[0],e[1]);
        }

        int source = 1;
        System.out.println("DFS from source " + source);
        DFS(adj, source);
    }
}
