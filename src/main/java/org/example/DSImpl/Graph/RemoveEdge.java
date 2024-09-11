package org.example.DSImpl.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveEdge {
    private HashMap<String, ArrayList<String>> adjList =
            new HashMap<>();

    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null || adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
}
