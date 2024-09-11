package org.example.DSImpl.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class AddEdge {

    private HashMap<String, ArrayList<String>> adjList =
            new HashMap<>();
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
}
